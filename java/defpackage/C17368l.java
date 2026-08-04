package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: lًٗۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17368l {
    public final List loadAd;
    public final int yandex;

    public C17368l() {
        this.yandex = 1;
        this.loadAd = Collections.singletonList(null);
    }

    public boolean crashlytics(int i) {
        return (this.yandex & i) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public List loadAd(C17219l c17219l) {
        String str;
        int i;
        List listSingletonList;
        boolean zCrashlytics = crashlytics(32);
        List list = this.loadAd;
        if (zCrashlytics) {
            return list;
        }
        C13143l c13143l = new C13143l((byte[]) c17219l.f33426l);
        ArrayList arrayList = list;
        while (c13143l.yandex() > 0) {
            int iSignatures = c13143l.signatures();
            int iSignatures2 = c13143l.loadAd + c13143l.signatures();
            if (iSignatures == 134) {
                arrayList = new ArrayList();
                int iSignatures3 = c13143l.signatures() & 31;
                for (int i2 = 0; i2 < iSignatures3; i2++) {
                    String strAdvert = c13143l.advert(3, StandardCharsets.UTF_8);
                    int iSignatures4 = c13143l.signatures();
                    boolean z = (iSignatures4 & 128) != 0;
                    if (z) {
                        i = iSignatures4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bSignatures = (byte) c13143l.signatures();
                    c13143l.m3568throw(1);
                    if (z) {
                        boolean z2 = (bSignatures & 64) != 0;
                        byte[] bArr = AbstractC14501l.yandex;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    C12984l c12984l = new C12984l();
                    c12984l.vip = AbstractC3825l.vip(str);
                    c12984l.amazon = strAdvert;
                    c12984l.f25441native = i;
                    c12984l.adcel = listSingletonList;
                    arrayList.add(new C5978l(c12984l));
                }
            }
            c13143l.m3562for(iSignatures2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    public InterfaceC8865l yandex(int i, C17219l c17219l) {
        String str = (String) c17219l.f33423l;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new C14073l(new C14510l(str, c17219l.m4286for(), "video/mp2t"));
            }
            if (i == 21) {
                return new C14073l(new C0169l());
            }
            if (i == 27) {
                if (crashlytics(4)) {
                    return null;
                }
                return new C14073l(new C18062l(new C3250l(0, loadAd(c17219l)), crashlytics(1), crashlytics(8)));
            }
            if (i == 36) {
                return new C14073l(new C8155l(new C3250l(0, loadAd(c17219l))));
            }
            if (i == 45) {
                return new C14073l(new C16718l());
            }
            if (i == 89) {
                return new C14073l(new C0169l((List) c17219l.f33427l));
            }
            if (i == 172) {
                return new C14073l(new C13916l(c17219l.m4286for(), 1, str, "video/mp2t"));
            }
            if (i == 257) {
                return new C14144l(new C18449l("application/vnd.dvb.ait", 28));
            }
            if (i != 138) {
                if (i == 139) {
                    return new C14073l(new C4475l(str, c17219l.m4286for(), 5408));
                }
                switch (i) {
                    case 15:
                        if (crashlytics(2)) {
                            return null;
                        }
                        return new C14073l(new C5132l(c17219l.m4286for(), str, "video/mp2t", false));
                    case 16:
                        return new C14073l(new C10395l(new C3250l(1, loadAd(c17219l))));
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        if (crashlytics(2)) {
                            return null;
                        }
                        return new C14073l(new C2622l(str, c17219l.m4286for()));
                    default:
                        switch (i) {
                            case 128:
                                break;
                            case 129:
                                return new C14073l(new C13916l(c17219l.m4286for(), 0, str, "video/mp2t"));
                            case 130:
                                if (!crashlytics(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 134:
                                        if (crashlytics(16)) {
                                            return null;
                                        }
                                        return new C14144l(new C18449l("application/x-scte35", 28));
                                    case 135:
                                        return new C14073l(new C13916l(c17219l.m4286for(), 0, str, "video/mp2t"));
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new C14073l(new C4475l(str, c17219l.m4286for(), 4096));
        }
        return new C14073l(new C9619l(new C3250l(1, loadAd(c17219l)), "video/mp2t"));
    }

    public /* synthetic */ C17368l(int i, List list) {
        this.yandex = i;
        this.loadAd = list;
    }

    public C17368l(ArrayList arrayList) {
        this.yandex = 0;
        this.loadAd = arrayList;
    }
}
