package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.cert.Extension;
import java.util.List;

/* JADX INFO: renamed from: lؙؚٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6541l implements InterfaceC18679l, InterfaceC3266l, InterfaceC13934l, InterfaceC8086l, InterfaceC15129l, InterfaceC12365l, InterfaceC6351l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13651l;

    public /* synthetic */ C6541l(String str) {
        this.f13651l = 4;
    }

    public static /* synthetic */ void billing(int i, Object obj) {
        throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + obj);
    }

    public static /* synthetic */ void firebase(String str) {
        throw new C14747l(str);
    }

    public static /* synthetic */ void isPro(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void mopub(int i, Object obj, String str) {
        throw new IllegalStateException((str + i + obj).toString());
    }

    public static /* bridge */ /* synthetic */ Extension purchase(Object obj) {
        return (Extension) obj;
    }

    public static /* synthetic */ void subs(String str) {
        throw new NullPointerException(str);
    }

    @Override // defpackage.InterfaceC18679l
    public void accept(Object obj) {
        C18602l c18602l = (C18602l) obj;
        switch (this.f13651l) {
            case 0:
                c18602l.mo2787l();
                break;
            case 1:
                c18602l.mo2773l();
                break;
            case 2:
                c18602l.mo2749case();
                break;
            case 3:
                c18602l.isVip();
                break;
            case 4:
            case 8:
            case 9:
            default:
                c18602l.adcel();
                break;
            case 5:
                c18602l.mo2786l();
                break;
            case 6:
                c18602l.mo2785l();
                break;
            case 7:
                c18602l.mo2811throws();
                break;
            case 10:
                c18602l.stop();
                break;
            case 11:
                c18602l.mo2757final();
                break;
            case 12:
                c18602l.premium();
                break;
            case 13:
                c18602l.yandex();
                break;
        }
    }

    @Override // defpackage.InterfaceC3266l
    public Object admob(C3726l c3726l, C6499l c6499l, int i) {
        return c3726l.license(c6499l);
    }

    @Override // defpackage.InterfaceC6351l
    public C12418l amazon(AbstractC3302l abstractC3302l) {
        return ((C6457l) abstractC3302l).yandex;
    }

    @Override // defpackage.InterfaceC8086l
    public Object apply(Object obj) {
        C4572l c4572l = (C4572l) obj;
        c4572l.getClass();
        C4816l c4816l = AbstractC7693l.yandex;
        c4816l.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c4816l.yandex(c4572l, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // defpackage.InterfaceC12365l
    public C11644l crashlytics(AbstractC6968l abstractC6968l) {
        C2782l c2782l = C2782l.f6068l;
        C11644l c11644l = ((C0624l) abstractC6968l).admob;
        C0624l.isPro(c11644l, c2782l);
        return c11644l;
    }

    @Override // defpackage.InterfaceC15129l
    public boolean loadAd(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // defpackage.InterfaceC13934l
    public void yandex(C18602l c18602l, C6499l c6499l, List list) {
        switch (this.f13651l) {
            case 8:
                c18602l.mo2768l(list);
                break;
            default:
                c18602l.mo2768l(list);
                break;
        }
    }

    public /* synthetic */ C6541l(int i) {
        this.f13651l = i;
    }
}
