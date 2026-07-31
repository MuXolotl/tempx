package androidx.car.app.utils;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;
import defpackage.AbstractC15560l;
import defpackage.AbstractC6475l;
import defpackage.AbstractC9859l;
import defpackage.C15277l;
import defpackage.C15858l;
import defpackage.C17706l;
import defpackage.InterfaceC11652l;
import defpackage.InterfaceC12745l;
import defpackage.InterfaceC6610l;
import defpackage.RunnableC15278l;
import defpackage.RunnableC4063l;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class billing {
    public static void amazon(String str, InterfaceC6610l interfaceC6610l) {
        try {
            purchase(str, interfaceC6610l);
        } catch (RemoteException e) {
            Log.e("CarApp.Dispatch", "Host unresponsive when dispatching call ".concat(str), e);
        }
    }

    public static void billing(IOnDoneCallback iOnDoneCallback, String str, Exception exc) {
        amazon(str.concat(" onFailure"), new C17706l(iOnDoneCallback, exc, str, 15));
    }

    public static void crashlytics(IOnDoneCallback iOnDoneCallback, String str, InterfaceC11652l interfaceC11652l) {
        AbstractC9859l.loadAd(new RunnableC15278l(iOnDoneCallback, str, interfaceC11652l, 5));
    }

    public static void loadAd(AbstractC6475l abstractC6475l, IOnDoneCallback iOnDoneCallback, String str, InterfaceC11652l interfaceC11652l) {
        AbstractC9859l.loadAd(new RunnableC4063l(abstractC6475l, iOnDoneCallback, str, interfaceC11652l, 17));
    }

    public static void mopub(IOnDoneCallback iOnDoneCallback, String str, Object obj) {
        amazon(str.concat(" onSuccess"), new C17706l(iOnDoneCallback, obj, str, 14));
    }

    public static Object purchase(String str, InterfaceC6610l interfaceC6610l) {
        try {
            if (Log.isLoggable("CarApp", 3)) {
                Log.d("CarApp", "Dispatching call " + str + " to host");
            }
            return interfaceC6610l.call();
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new C15277l(AbstractC15560l.Signature("Remote ", str, " call failed"), e2);
        }
    }

    public static IOnDoneCallback yandex() {
        final InterfaceC12745l interfaceC12745l = null;
        return new IOnDoneCallback.Stub(interfaceC12745l) { // from class: androidx.car.app.utils.RemoteUtils$1
            final /* synthetic */ InterfaceC12745l val$callback;

            @Override // androidx.car.app.IOnDoneCallback
            public void onFailure(C15858l c15858l) {
                throw null;
            }

            @Override // androidx.car.app.IOnDoneCallback
            public void onSuccess(C15858l c15858l) {
                throw null;
            }
        };
    }
}
