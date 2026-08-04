package defpackage;

import android.media.AudioDescriptor;
import android.os.Handler;
import android.os.IInterface;
import android.os.SystemClock;
import android.view.autofill.AutofillId;
import android.window.OnBackInvokedDispatcher;
import androidx.car.app.IAppHost;
import androidx.car.app.navigation.model.Maneuver;
import java.io.EOFException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: lًۢٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8339l implements InterfaceC1082l, InterfaceC16975l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17266l;

    public /* synthetic */ C8339l(int i) {
        this.f17266l = i;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor amazon(Object obj) {
        return (AudioDescriptor) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher billing(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* synthetic */ void isPro(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void metrica(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void mopub() {
        throw new ConcurrentModificationException();
    }

    public static /* bridge */ /* synthetic */ AutofillId purchase(Object obj) {
        return (AutofillId) obj;
    }

    public static /* synthetic */ void remoteconfig(AlgorithmParameters algorithmParameters) throws InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("can't handle parameter " + ((Object) algorithmParameters.toString()));
    }

    public static /* synthetic */ void smaato(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void subs(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void vip() throws EOFException {
        throw new EOFException();
    }

    @Override // defpackage.InterfaceC1082l
    public Object firebase(IInterface iInterface) {
        ((IAppHost) iInterface).invalidate();
        return null;
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        long jM3969goto;
        C7026l c7026l;
        C2865l c2865l;
        C16717l c16717l;
        switch (this.f17266l) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C9482l c9482l = (C9482l) obj;
                C7653l c7653l = c9482l.loadAd;
                if (c9482l == c7653l.firebase && c7653l.metrica != null) {
                    C1955l c1955l = c7653l.adcel;
                    int i = c1955l.f4448l;
                    if (i != -1) {
                        long j = ((C17953l) c1955l.f4450l).billing / i;
                        C4636l c4636l = c7653l.Signature;
                        c4636l.getClass();
                        jM3969goto = AbstractC15323l.m3969goto(c4636l.yandex.getSampleRate(), j);
                    } else {
                        jM3969goto = -9223372036854775807L;
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - c7653l.f15756default;
                    C7026l c7026l2 = c7653l.metrica;
                    int i2 = ((C17953l) c7653l.adcel.f4450l).billing;
                    long jM3986try = AbstractC15323l.m3986try(jM3969goto);
                    C18595l c18595l = ((C4886l) c7026l2.f14720l).f9973l;
                    Handler handler = (Handler) c18595l.f36317l;
                    if (handler != null) {
                        handler.post(new RunnableC11914l(c18595l, i2, jM3986try, jElapsedRealtime, 0));
                        return;
                    }
                    return;
                }
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C9482l c9482l2 = (C9482l) obj;
                c9482l2.getClass();
                C7653l.f15751abstract.getAndDecrement();
                C7026l c7026l3 = c9482l2.loadAd.metrica;
                if (c7026l3 != null) {
                    C17953l c17953l = c9482l2.yandex;
                    C16583l c16583l = new C16583l(c17953l.yandex, c17953l.loadAd, c17953l.crashlytics, c17953l.amazon, c17953l.purchase, c17953l.billing);
                    C18595l c18595l2 = ((C4886l) c7026l3.f14720l).f9973l;
                    Handler handler2 = (Handler) c18595l2.f36317l;
                    if (handler2 != null) {
                        handler2.post(new RunnableC7667l(c18595l2, c16583l, 0));
                        return;
                    }
                    return;
                }
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C9482l c9482l3 = (C9482l) obj;
                C7653l c7653l2 = c9482l3.loadAd;
                if (c9482l3 == c7653l2.firebase && (c7026l = c7653l2.metrica) != null && c7653l2.f15753catch && (c2865l = ((C4886l) c7026l.f14720l).f13939l) != null) {
                    c2865l.yandex();
                    return;
                }
                return;
            case 20:
                C9482l c9482l4 = (C9482l) obj;
                C7653l c7653l3 = c9482l4.loadAd;
                if (c9482l4 == c7653l3.firebase && c7653l3.f15760for) {
                    c7653l3.f15773throw = true;
                    return;
                }
                return;
            default:
                C7026l c7026l4 = ((C2591l) obj).yandex.metrica;
                if (c7026l4 != null) {
                    C4886l c4886l = (C4886l) c7026l4.f14720l;
                    synchronized (c4886l.f3013l) {
                        c16717l = c4886l.f3024l;
                        break;
                    }
                    if (c16717l != null) {
                        c16717l.firebase();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
