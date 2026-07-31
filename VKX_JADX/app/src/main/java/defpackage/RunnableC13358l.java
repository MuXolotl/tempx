package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: lّْٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC13358l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ ServiceConnectionC16475l f26217l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f26218l;

    public /* synthetic */ RunnableC13358l(ServiceConnectionC16475l serviceConnectionC16475l, int i) {
        this.f26218l = i;
        this.f26217l = serviceConnectionC16475l;
    }

    private final void yandex() {
        ServiceConnectionC16475l serviceConnectionC16475l = this.f26217l;
        synchronized (serviceConnectionC16475l) {
            if (serviceConnectionC16475l.f32202l == 1) {
                serviceConnectionC16475l.yandex("Timed out while binding");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26218l) {
            case 0:
                break;
            case 1:
                yandex();
                return;
            default:
                this.f26217l.yandex("Service disconnected");
                return;
        }
        while (true) {
            ServiceConnectionC16475l serviceConnectionC16475l = this.f26217l;
            synchronized (serviceConnectionC16475l) {
                try {
                    if (serviceConnectionC16475l.f32202l != 2) {
                        return;
                    }
                    if (serviceConnectionC16475l.f32204l.isEmpty()) {
                        serviceConnectionC16475l.crashlytics();
                        return;
                    }
                    C7075l c7075l = (C7075l) serviceConnectionC16475l.f32204l.poll();
                    serviceConnectionC16475l.f32203l.put(c7075l.yandex, c7075l);
                    ((ScheduledExecutorService) serviceConnectionC16475l.f32205l.f33427l).schedule(new RunnableC16301l((Object) serviceConnectionC16475l, (Object) c7075l, false, 18), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(c7075l)));
                    }
                    C17219l c17219l = serviceConnectionC16475l.f32205l;
                    Messenger messenger = serviceConnectionC16475l.f32201l;
                    int i = c7075l.crashlytics;
                    Context context = (Context) c17219l.f33423l;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = c7075l.yandex;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", c7075l.yandex());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", c7075l.amazon);
                    messageObtain.setData(bundle);
                    try {
                        C7847l c7847l = serviceConnectionC16475l.f32200l;
                        Messenger messenger2 = (Messenger) c7847l.f16370l;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            C1882l c1882l = (C1882l) c7847l.f16369l;
                            if (c1882l == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = c1882l.f4311l;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        serviceConnectionC16475l.yandex(e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
