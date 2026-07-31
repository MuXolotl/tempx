package defpackage;

import android.animation.ValueAnimator;
import android.graphics.ColorSpace;
import android.graphics.PointF;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import com.google.firebase.datatransport.TransportRegistrar;
import java.security.cert.PKIXRevocationChecker;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: lَِؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1759l implements InterfaceC18070l, InterfaceC11884l, InterfaceC0631l, InterfaceC9215l, InterfaceC5127l, InterfaceC15244l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f4173l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C1759l f4169l = new C1759l(13);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C1759l f4168l = new C1759l(14);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C1759l f4171l = new C1759l(15);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C1759l f4170l = new C1759l(16);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C1759l f4172l = new C1759l(17);

    public /* synthetic */ C1759l(int i) {
        this.f4173l = i;
    }

    public static /* synthetic */ void adcel(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj);
    }

    public static /* synthetic */ void ads(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* bridge */ /* synthetic */ ColorSpace billing(Object obj) {
        return (ColorSpace) obj;
    }

    public static /* synthetic */ void firebase(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void isPro(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void metrica(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* bridge */ /* synthetic */ PKIXRevocationChecker mopub(Object obj) {
        return (PKIXRevocationChecker) obj;
    }

    public static /* synthetic */ void smaato(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void startapp(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void subs(int i, Object obj, String str) {
        throw new IllegalStateException((str + obj + ((char) i)).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void vip(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    @Override // defpackage.InterfaceC0631l
    public C17270l amazon(Float f) {
        return new C17270l(new PointF());
    }

    @Override // defpackage.InterfaceC9215l
    public /* synthetic */ boolean crashlytics() {
        switch (this.f4173l) {
        }
        return true;
    }

    @Override // defpackage.InterfaceC9215l
    public void loadAd(C9967l c9967l, View view, int i, float f) {
        switch (this.f4173l) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (view != null) {
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    view.setScaleY(1.0f);
                    view.setScaleX(1.0f);
                }
                break;
            default:
                float f2 = 1.0f - f;
                if (view != null) {
                    if (i != 2) {
                        float width = c9967l.getWidth();
                        view.setTranslationX((-(width - (f2 * width))) * 0.35f);
                    } else {
                        view.setTranslationX(c9967l.getWidth() * f2);
                    }
                }
                break;
        }
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        switch (this.f4173l) {
            case 21:
                return TransportRegistrar.lambda$getComponents$0(c11644l);
            case 22:
                return TransportRegistrar.lambda$getComponents$1(c11644l);
            default:
                return TransportRegistrar.lambda$getComponents$2(c11644l);
        }
    }

    @Override // defpackage.InterfaceC11884l
    public void yandex(C10295l c10295l, float[] fArr, RunnableC12388l runnableC12388l) {
        switch (this.f4173l) {
            case 7:
                runnableC12388l.run();
                break;
            default:
                ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                duration.addUpdateListener(new C14131l(5, c10295l));
                duration.addListener(new C7538l(6, runnableC12388l));
                duration.start();
                break;
        }
    }

    @Override // defpackage.InterfaceC5127l
    public void purchase(Exception exc) {
    }
}
