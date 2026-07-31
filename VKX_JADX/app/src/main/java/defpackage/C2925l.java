package defpackage;

import java.io.File;
import java.util.Locale;

/* JADX INFO: renamed from: lؔۜۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C2925l {
    public String amazon;
    public InterfaceC13280l crashlytics;
    public InterfaceC1227l loadAd;
    public File yandex;

    public C2925l(File file, String str, C16492l c16492l, InterfaceC13280l interfaceC13280l) {
        AbstractC6745l.yandex(file);
        if (str == null || AbstractC1315l.purchase(str)) {
            C11983l.crashlytics();
            throw null;
        }
        AbstractC6745l.yandex(c16492l);
        this.yandex = file;
        this.amazon = str;
        this.loadAd = c16492l;
        this.crashlytics = interfaceC13280l;
    }

    public InterfaceC13280l crashlytics(InterfaceC15476l interfaceC15476l) {
        InterfaceC13280l interfaceC13280l = (InterfaceC13280l) interfaceC15476l;
        this.crashlytics = interfaceC13280l;
        return interfaceC13280l;
    }

    public void loadAd() throws C9511l {
        AbstractC8233l c5231l;
        InterfaceC13280l interfaceC13280l = this.crashlytics;
        if (interfaceC13280l != null && interfaceC13280l.loadAd()) {
            throw new C9511l("Opened read only");
        }
        C10111l c10111lTapsense = C10111l.tapsense();
        c10111lTapsense.getClass();
        String str = this.amazon;
        C10360l c10360l = (C10360l) ((AbstractC13675l) c10111lTapsense.f20589l).get(str);
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        if (c10360l == null) {
            throw new C9511l("No Deleter associated with this extension:%s", str);
        }
        switch (c10360l.yandex) {
            case 0:
                C6588l c6588l = new C6588l();
                C8398l c8398l = new C8398l();
                c8398l.yandex = new C17925l(z2 ? 1 : 0);
                c6588l.crashlytics = c8398l;
                c5231l = c6588l;
                break;
            case 1:
                C11816l c11816l = new C11816l();
                c11816l.amazon = new C17305l();
                c5231l = c11816l;
                break;
            case 2:
                c5231l = new C5231l();
                break;
            case 3:
                c5231l = new C10895l();
                break;
            case 4:
                c5231l = new C7146l();
                break;
            case 5:
                c5231l = new C14030l();
                break;
            case 6:
                C17985l c17985l = new C17985l();
                C2955l c2955l = new C2955l();
                c2955l.yandex = new C2359l();
                c17985l.amazon = c2955l;
                c5231l = c17985l;
                break;
            default:
                C13578l c13578l = new C13578l();
                C9269l c9269l = new C9269l();
                C3316l c3316l = new C3316l(15, z);
                c3316l.f7072l = new C17925l(i);
                c9269l.yandex = c3316l;
                c9269l.loadAd = new C7433l();
                c13578l.crashlytics = c9269l;
                c5231l = c13578l;
                break;
        }
        InterfaceC9826l interfaceC9826l = (C12240l) c10111lTapsense.f20587l;
        if (interfaceC9826l == null) {
            interfaceC9826l = C3527l.yandex;
        }
        c5231l.yandex = interfaceC9826l;
        c5231l.amazon(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFileImpl{file=");
        sb.append(this.yandex);
        sb.append(", audioHeader=");
        sb.append(this.loadAd);
        sb.append(", tag=");
        sb.append(this.crashlytics);
        sb.append(", extension='");
        return AbstractC0653l.ads(sb, this.amazon, "'}");
    }

    public InterfaceC15476l yandex() {
        String strPurchase = AbstractC5578l.purchase(this.yandex.getName());
        EnumC13899l enumC13899l = EnumC13899l.f27181l;
        EnumC13899l enumC13899l2 = (EnumC13899l) EnumC13899l.f27191l.get(strPurchase.toLowerCase(Locale.ROOT));
        if (enumC13899l2 != null) {
            enumC13899l = enumC13899l2;
        }
        return enumC13899l.yandex();
    }
}
