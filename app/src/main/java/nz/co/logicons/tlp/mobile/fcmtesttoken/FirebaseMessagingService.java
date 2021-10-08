package nz.co.logicons.tlp.mobile.fcmtesttoken;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.RemoteMessage;

/*
 * @author by Allen
 */
public class FirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
    }

    @Override
    public void onNewToken(@NonNull String s) {
        super.onNewToken(s);
    }
}
