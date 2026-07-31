package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lۣؑؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0662l implements InterfaceC8115l, InterfaceC9762l, InterfaceC2785l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C15546l f2132l;

    public /* synthetic */ C0662l(C15546l c15546l) {
        this.f2132l = c15546l;
    }

    @Override // defpackage.InterfaceC2785l
    public void loadAd(InterfaceC15189l interfaceC15189l) {
        C15546l c15546l = this.f2132l;
        C17334l c17334l = C17334l.f33646l;
        c17334l.m4316l("AnalyticsConnector now available.");
        InterfaceC6235l interfaceC6235l = (InterfaceC6235l) interfaceC15189l.get();
        C1770l c1770l = new C1770l(9, interfaceC6235l);
        boolean z = false;
        C3797l c3797l = new C3797l(13, z);
        C18110l c18110l = (C18110l) interfaceC6235l;
        C1083l c1083lLoadAd = c18110l.loadAd("clx", c3797l);
        if (c1083lLoadAd == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            c1083lLoadAd = c18110l.loadAd("crash", c3797l);
            if (c1083lLoadAd != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (c1083lLoadAd == null) {
            c17334l.m4317l("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        c17334l.m4316l("Registered Firebase Analytics listener.");
        C3585l c3585l = new C3585l(6, z);
        C0554l c0554l = new C0554l();
        c0554l.f1957l = new Object();
        c0554l.f1958l = c1770l;
        synchronized (c15546l) {
            try {
                Iterator it = ((ArrayList) c15546l.yandex).iterator();
                while (it.hasNext()) {
                    c3585l.yandex((C3323l) it.next());
                }
                c3797l.f7902l = c3585l;
                c3797l.f7903l = c0554l;
                c15546l.crashlytics = c3585l;
                c15546l.loadAd = c0554l;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC9762l
    public void startapp(Bundle bundle) {
        ((InterfaceC9762l) this.f2132l.loadAd).startapp(bundle);
    }

    @Override // defpackage.InterfaceC8115l
    public void yandex(C3323l c3323l) {
        C15546l c15546l = this.f2132l;
        synchronized (c15546l) {
            try {
                if (((InterfaceC8115l) c15546l.crashlytics) instanceof C2471l) {
                    ((ArrayList) c15546l.yandex).add(c3323l);
                }
                ((InterfaceC8115l) c15546l.crashlytics).yandex(c3323l);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
