package defpackage;

import android.util.Rational;
import android.util.Size;
import j$.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٔٗؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14929l implements InterfaceC16651l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C5104l f29382l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f29383l;

    public C14929l(C5104l c5104l, int i) {
        this.f29383l = i;
        switch (i) {
            case 1:
                this.f29382l = c5104l;
                C6916l c6916l = InterfaceC15273l.f29872l;
                Class cls = (Class) c5104l.smaato(c6916l, null);
                if (cls != null && !cls.equals(C9731l.class)) {
                    C1759l.smaato("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                c5104l.mopub(InterfaceC0048l.f919l, EnumC11949l.f23817l);
                c5104l.mopub(c6916l, C9731l.class);
                C6916l c6916l2 = InterfaceC15273l.f29871l;
                if (c5104l.smaato(c6916l2, null) == null) {
                    c5104l.mopub(c6916l2, C9731l.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 2:
                this.f29382l = c5104l;
                C6916l c6916l3 = InterfaceC15273l.f29872l;
                Class cls2 = (Class) c5104l.smaato(c6916l3, null);
                if (cls2 != null && !cls2.equals(C0527l.class)) {
                    C1759l.smaato("Invalid target class configuration for ", this, ": ", cls2);
                    throw null;
                }
                c5104l.mopub(InterfaceC0048l.f919l, EnumC11949l.f23816l);
                c5104l.mopub(c6916l3, C0527l.class);
                C6916l c6916l4 = InterfaceC15273l.f29871l;
                if (c5104l.smaato(c6916l4, null) == null) {
                    c5104l.mopub(c6916l4, C0527l.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                C6916l c6916l5 = InterfaceC4089l.inmobi;
                if (((Integer) c5104l.smaato(c6916l5, -1)).intValue() == -1) {
                    c5104l.mopub(c6916l5, 2);
                    return;
                }
                return;
            case 3:
                this.f29382l = c5104l;
                if (!c5104l.f15372l.containsKey(C11550l.f23223l)) {
                    C8339l.metrica("VideoOutput is required");
                    throw null;
                }
                C6916l c6916l6 = InterfaceC15273l.f29872l;
                Class cls3 = (Class) c5104l.smaato(c6916l6, null);
                if (cls3 != null && !cls3.equals(C10418l.class)) {
                    C1759l.smaato("Invalid target class configuration for ", this, ": ", cls3);
                    throw null;
                }
                c5104l.mopub(InterfaceC0048l.f919l, EnumC11949l.f23819l);
                c5104l.mopub(c6916l6, C10418l.class);
                C6916l c6916l7 = InterfaceC15273l.f29871l;
                if (c5104l.smaato(c6916l7, null) == null) {
                    c5104l.mopub(c6916l7, C10418l.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            default:
                this.f29382l = c5104l;
                C6916l c6916l8 = InterfaceC15273l.f29872l;
                Class cls4 = (Class) c5104l.smaato(c6916l8, null);
                if (cls4 != null && !cls4.equals(C9585l.class)) {
                    C1759l.smaato("Invalid target class configuration for ", this, ": ", cls4);
                    throw null;
                }
                c5104l.mopub(InterfaceC0048l.f919l, EnumC11949l.f23814l);
                c5104l.mopub(c6916l8, C9585l.class);
                C6916l c6916l9 = InterfaceC15273l.f29871l;
                if (c5104l.smaato(c6916l9, null) == null) {
                    c5104l.mopub(c6916l9, C9585l.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC16651l
    public final InterfaceC0048l Signature() {
        int i = this.f29383l;
        C5104l c5104l = this.f29382l;
        switch (i) {
            case 0:
                return new C16506l(C7420l.yandex(c5104l));
            case 1:
                return new C14180l(C7420l.yandex(c5104l));
            case 2:
                return new C8749l(C7420l.yandex(c5104l));
            default:
                return new C11550l(C7420l.yandex(c5104l));
        }
    }

    @Override // defpackage.InterfaceC5479l
    public final C5104l adcel() {
        switch (this.f29383l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f29382l;
    }

    public C9731l yandex() {
        Integer numValueOf = Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        C6916l c6916l = C14180l.f27770l;
        C5104l c5104l = this.f29382l;
        Integer num = (Integer) c5104l.smaato(c6916l, null);
        if (num != null) {
            c5104l.mopub(InterfaceC16352l.advert, num);
        } else {
            C3511l c3511l = C9731l.applovin;
            C6916l c6916l2 = C14180l.f27769l;
            if (Objects.equals(c5104l.smaato(c6916l2, null), 2)) {
                c5104l.mopub(InterfaceC16352l.advert, 32);
            } else if (Objects.equals(c5104l.smaato(c6916l2, null), 3)) {
                c5104l.mopub(InterfaceC16352l.advert, 32);
                c5104l.mopub(InterfaceC16352l.isVip, numValueOf);
            } else if (Objects.equals(c5104l.smaato(c6916l2, null), 1)) {
                c5104l.mopub(InterfaceC16352l.advert, 4101);
                c5104l.mopub(InterfaceC16352l.signatures, C15421l.crashlytics);
            } else {
                c5104l.mopub(InterfaceC16352l.advert, numValueOf);
            }
        }
        C14180l c14180l = new C14180l(C7420l.yandex(c5104l));
        AbstractC17666l.billing(c14180l);
        C9731l c9731l = new C9731l(c14180l);
        Size size = (Size) c5104l.smaato(InterfaceC4089l.f8426throws, null);
        if (size != null) {
            c9731l.license = new Rational(size.getWidth(), size.getHeight());
        }
        AbstractC5641l.amazon((Executor) c5104l.smaato(InterfaceC5178l.f11243private, AbstractC12272l.mopub()), "The IO executor can't be null");
        C6916l c6916l3 = C14180l.f27764l;
        if (c5104l.f15372l.containsKey(c6916l3)) {
            Integer num2 = (Integer) c5104l.adcel(c6916l3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                C1759l.ads(num2, "The flash mode is not allowed to set: ");
                return null;
            }
            if (num2.intValue() == 3 && c5104l.smaato(C14180l.f27771l, null) == null) {
                C8339l.metrica("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                return null;
            }
        }
        return c9731l;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14929l(int i) {
        this(C5104l.crashlytics(), 0);
        this.f29383l = i;
        switch (i) {
            case 1:
                this(C5104l.crashlytics(), 1);
                break;
            case 2:
                this(C5104l.crashlytics(), 2);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C14929l(InterfaceC14105l interfaceC14105l) {
        this.f29383l = 3;
        C5104l c5104lCrashlytics = C5104l.crashlytics();
        c5104lCrashlytics.mopub(C11550l.f23223l, interfaceC14105l);
        c5104lCrashlytics.mopub(InterfaceC0048l.f923l, Boolean.valueOf(interfaceC14105l.mopub()));
        this(c5104lCrashlytics, 3);
    }
}
