package com.allokgames.eventhelawn.our_project.Controller;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.os.Handler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/**
 * Created by User on 16.02.2017.
 */
public class ServerActivity extends Activity {
    private static final int MESSAGE_READ = 0;
    Handler mHandler;
    private static long b;
    private static long a;
    private static final UUID MY_UUID = new UUID(a,b);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    String NAME;
    BluetoothAdapter mBluetoothAdapter;
    private class AcceptThread extends Thread{
        private final BluetoothServerSocket mmServerSocket;

        public AcceptThread(){
// используем вспомогательную переменную, которую в дальнейшем
// свяжем с mmServerSocket,
            BluetoothServerSocket tmp=null;
            try{
// MY_UUID это UUID нашего приложения, это же значение
// используется в клиентском приложении
                tmp= mBluetoothAdapter.listenUsingRfcommWithServiceRecord(NAME, MY_UUID);
            } catch(IOException e){}
            mmServerSocket= tmp;
        }

        public void run(){
            BluetoothSocket socket=null;
// ждем пока не произойдет ошибка или не
// будет возвращен сокет
            while(true){
                try{
                    socket= mmServerSocket.accept();
                } catch(IOException e){
                    break;
                }
// если соединение было подтверждено
                if(socket!=null){
// управлчем соединением (в отдельном потоке)
                    manageConnectedSocket(socket);try{
                        mmServerSocket.close();
                    } catch(IOException e){}
                    break;
                }
            }
        }


        /** отмена ожидания сокета */
        public void cancel(){
            try{
                mmServerSocket.close();
            } catch(IOException e){}
        }
    }
    void manageConnectedSocket(BluetoothSocket mmSocket){

    }
    private class ConnectedThread extends Thread{
        private final BluetoothSocket mmSocket;
        private final InputStream mmInStream;
        private final OutputStream mmOutStream;

        public ConnectedThread(BluetoothSocket socket){
            mmSocket= socket;
            InputStream tmpIn=null;
            OutputStream tmpOut=null;

// Получить входящий и исходящий потоки данных
            try{
                tmpIn= socket.getInputStream();
                tmpOut= socket.getOutputStream();
            } catch(IOException e){}

            mmInStream= tmpIn;
            mmOutStream= tmpOut;
        }

        public void run(){
            byte[] buffer=new byte[1024];// буферный массив
            int bytes;// bytes returned from read()

// Прослушиваем InputStream пока не произойдет исключение
            while(true){
                try{
// читаем из InputStream
                    bytes= mmInStream.read(buffer);
// посылаем прочитанные байты главной деятельности
                    mHandler.obtainMessage(MESSAGE_READ, bytes,-1, buffer)
                            .sendToTarget();
                } catch(IOException e){
                    break;
                }
            }
        }

        /* Вызываем этот метод из главной деятельности, чтобы отправить данные
        удаленному устройству */
        public void write(byte[] bytes){
            try{
                mmOutStream.write(bytes);
            } catch(IOException e){}
        }

        /* Вызываем этот метод из главной деятельности,
        чтобы разорвать соединение */
        public void cancel(){
            try{
                mmSocket.close();
            } catch(IOException e){}
        }}}
