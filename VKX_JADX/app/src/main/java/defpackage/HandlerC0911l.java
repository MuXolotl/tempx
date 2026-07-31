package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: renamed from: lًؒٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class HandlerC0911l extends HandlerC4052l {
    public final /* synthetic */ AbstractC4620l yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0911l(AbstractC4620l abstractC4620l, Looper looper) {
        super(looper, 7);
        this.yandex = abstractC4620l;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        AbstractC10093l abstractC10093l;
        AbstractC4620l abstractC4620l = this.yandex;
        int i = abstractC4620l.advert.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (abstractC10093l = (AbstractC10093l) message.obj) != null) {
                abstractC10093l.crashlytics();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !abstractC4620l.tapsense()) {
            AbstractC10093l abstractC10093l2 = (AbstractC10093l) message.obj;
            if (abstractC10093l2 != null) {
                abstractC10093l2.crashlytics();
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            abstractC4620l.license = new C10602l(message.arg2, null, null);
            if (!abstractC4620l.pro && !TextUtils.isEmpty(abstractC4620l.startapp()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(abstractC4620l.startapp());
                    if (!abstractC4620l.pro) {
                        abstractC4620l.applovin(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            C10602l c10602l = abstractC4620l.license;
            if (c10602l == null) {
                c10602l = new C10602l(8, null, null);
            }
            abstractC4620l.firebase.crashlytics(c10602l);
            abstractC4620l.license(c10602l);
            return;
        }
        if (i4 == 5) {
            C10602l c10602l2 = abstractC4620l.license;
            if (c10602l2 == null) {
                c10602l2 = new C10602l(8, null, null);
            }
            abstractC4620l.firebase.crashlytics(c10602l2);
            abstractC4620l.license(c10602l2);
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            C10602l c10602l3 = new C10602l(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null);
            abstractC4620l.firebase.crashlytics(c10602l3);
            abstractC4620l.license(c10602l3);
            return;
        }
        if (i4 == 6) {
            abstractC4620l.applovin(5, null);
            InterfaceC9710l interfaceC9710l = abstractC4620l.startapp;
            if (interfaceC9710l != null) {
                interfaceC9710l.isPro(message.arg2);
            }
            abstractC4620l.pro(message.arg2);
            abstractC4620l.signatures(5, 1, null);
            return;
        }
        if (i4 == 2 && !abstractC4620l.subscription()) {
            AbstractC10093l abstractC10093l3 = (AbstractC10093l) message.obj;
            if (abstractC10093l3 != null) {
                abstractC10093l3.crashlytics();
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", AbstractC9361l.Signature(i5, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i5).length() + 34)), new Exception());
            return;
        }
        AbstractC10093l abstractC10093l4 = (AbstractC10093l) message.obj;
        synchronized (abstractC10093l4) {
            try {
                bool = abstractC10093l4.yandex;
                if (abstractC10093l4.loadAd) {
                    String string = abstractC10093l4.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            AbstractC4620l abstractC4620l2 = abstractC10093l4.billing;
            int i6 = abstractC10093l4.amazon;
            if (i6 != 0) {
                abstractC4620l2.applovin(1, null);
                Bundle bundle = abstractC10093l4.purchase;
                abstractC10093l4.loadAd(new C10602l(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!abstractC10093l4.yandex()) {
                abstractC4620l2.applovin(1, null);
                abstractC10093l4.loadAd(new C10602l(8, null, null));
            }
        }
        synchronized (abstractC10093l4) {
            abstractC10093l4.loadAd = true;
        }
        abstractC10093l4.crashlytics();
    }
}
