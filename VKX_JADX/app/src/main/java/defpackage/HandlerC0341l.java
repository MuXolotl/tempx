package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lٕؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0341l extends Handler {
    public Object crashlytics;
    public Object loadAd;
    public final /* synthetic */ int yandex = 2;

    public HandlerC0341l(C9557l c9557l) {
        this.loadAd = new WeakReference(c9557l);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.yandex) {
            case 0:
                WeakReference weakReference = (WeakReference) this.crashlytics;
                if (weakReference == null) {
                    return;
                }
                Messenger messenger = (Messenger) weakReference.get();
                C9557l c9557l = (C9557l) ((WeakReference) this.loadAd).get();
                if (messenger == null || c9557l == null) {
                    return;
                }
                Bundle data = message.getData();
                if (data != null) {
                    ClassLoader classLoader = C0458l.class.getClassLoader();
                    classLoader.getClass();
                    data.setClassLoader(classLoader);
                }
                try {
                    if (message.what != 3) {
                        AbstractC6427l.vip("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                        return;
                    }
                    AbstractC15323l.startapp(data.getBundle("data_options"));
                    AbstractC15323l.startapp(data.getBundle("data_notify_children_changed_options"));
                    String string = data.getString("data_media_item_id");
                    AbstractC16431l.amazon(data.getParcelableArrayList("data_media_item_list"), C11119l.CREATOR);
                    if (c9557l.mopub != messenger) {
                        return;
                    }
                    if (string != null && c9557l.purchase.get(string) != null) {
                        throw new ClassCastException();
                    }
                    AbstractC6427l.billing("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string);
                    return;
                } catch (BadParcelableException unused) {
                    AbstractC6427l.admob("MediaBrowserCompat", "Could not unparcel the data.");
                    return;
                }
            case 1:
                WeakReference weakReference2 = (WeakReference) this.loadAd;
                WeakReference weakReference3 = (WeakReference) this.crashlytics;
                if (weakReference3 == null || weakReference3.get() == null || weakReference2.get() == null) {
                    return;
                }
                Bundle data2 = message.getData();
                C0554l.appmetrica(data2);
                C10100l c10100l = (C10100l) weakReference2.get();
                Messenger messenger2 = (Messenger) ((WeakReference) this.crashlytics).get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        C0554l.appmetrica(data2.getBundle("data_root_hints"));
                        data2.getString("data_media_item_id");
                        c10100l.getClass();
                        return;
                    }
                    if (i == 2) {
                        c10100l.getClass();
                        return;
                    }
                    if (i != 3) {
                        Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                        return;
                    }
                    C0554l.appmetrica(data2.getBundle("data_options"));
                    C0554l.appmetrica(data2.getBundle("data_notify_children_changed_options"));
                    String string2 = data2.getString("data_media_item_id");
                    data2.getParcelableArrayList("data_media_item_list");
                    if (c10100l.mopub != messenger2) {
                        return;
                    }
                    if (c10100l.purchase.get(string2) != null) {
                        throw new ClassCastException();
                    }
                    if (C2987l.loadAd) {
                        Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + string2);
                        return;
                    }
                    return;
                } catch (BadParcelableException unused2) {
                    Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                    if (message.what == 1) {
                        c10100l.getClass();
                        return;
                    }
                    return;
                }
            default:
                super.handleMessage(message);
                return;
        }
    }

    public HandlerC0341l(C10100l c10100l) {
        this.loadAd = new WeakReference(c10100l);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0341l(C3726l c3726l, Looper looper) {
        super(looper);
        this.crashlytics = c3726l;
    }
}
