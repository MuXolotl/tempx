package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: lؙٕؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2630l {
    public final /* synthetic */ int yandex;

    static {
        int i = C3429l.loadAd;
    }

    public /* synthetic */ C2630l(int i) {
        this.yandex = i;
    }

    public static void yandex(AbstractC14080l abstractC14080l) throws C12383l {
        if (abstractC14080l == null || abstractC14080l.yandex()) {
            return;
        }
        C12383l c12383l = new C12383l((abstractC14080l instanceof AbstractC14080l ? new C6451l() : new C6451l()).getMessage());
        c12383l.f24472l = abstractC14080l;
        throw c12383l;
    }

    public final Object crashlytics(C1718l c1718l, C3429l c3429l) {
        switch (this.yandex) {
            case 0:
                return new C17113l(c1718l);
            case 1:
                return new C6431l(c1718l);
            case 2:
                return new C10459l(c1718l, c3429l);
            case 3:
                return new C3186l(c1718l, c3429l);
            case 4:
                return new C8732l(c1718l);
            case 5:
                return new C7899l(c1718l, c3429l);
            case 6:
                return new C14780l(c1718l, c3429l);
            case 7:
                return new C4207l(c1718l, c3429l);
            case 8:
                return new C6582l(c1718l, c3429l);
            case 9:
                return new C4987l(c1718l);
            case 10:
                return new C13347l(c1718l, c3429l);
            case 11:
                return new C15743l(c1718l, c3429l);
            case 12:
                return new C9781l(c1718l, c3429l);
            case 13:
                return new C16400l(c1718l, c3429l);
            case 14:
                return new C18092l(c1718l, c3429l);
            case 15:
                return new C14036l(c1718l, c3429l);
            case 16:
                return new C5665l(c1718l, c3429l);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C7431l(c1718l, c3429l);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C13146l(c1718l, c3429l);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C0012l(c1718l, c3429l);
            case 20:
                return new C8400l(c1718l);
            case 21:
                return new C8107l(c1718l);
            case 22:
                return new C18128l(c1718l, c3429l);
            case 23:
                return new C16093l(c1718l, c3429l);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C1512l(c1718l, c3429l);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C17586l(c1718l, c3429l);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C3647l(c1718l, c3429l);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C18426l(c1718l, c3429l);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C3617l(c1718l);
            default:
                return new C1339l(c1718l, c3429l);
        }
    }

    public final AbstractC14080l loadAd(ByteArrayInputStream byteArrayInputStream, C3429l c3429l) throws C12383l {
        AbstractC14080l abstractC14080l;
        try {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                abstractC14080l = null;
            } else {
                if ((i & 128) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 < 32) {
                            int i3 = byteArrayInputStream.read();
                            if (i3 == -1) {
                                throw C12383l.loadAd();
                            }
                            i |= (i3 & 127) << i2;
                            if ((i3 & 128) == 0) {
                                break;
                            }
                            i2 += 7;
                        } else {
                            while (true) {
                                if (i2 >= 64) {
                                    throw new C12383l("CodedInputStream encountered a malformed varint.");
                                }
                                int i4 = byteArrayInputStream.read();
                                if (i4 == -1) {
                                    throw C12383l.loadAd();
                                }
                                if ((i4 & 128) == 0) {
                                    break;
                                }
                                i2 += 7;
                            }
                        }
                    }
                }
                C1718l c1718l = new C1718l(new C14276l(byteArrayInputStream, i));
                abstractC14080l = (AbstractC14080l) crashlytics(c1718l, c3429l);
                try {
                    c1718l.yandex(0);
                } catch (C12383l e) {
                    e.f24472l = abstractC14080l;
                    throw e;
                }
            }
            yandex(abstractC14080l);
            return abstractC14080l;
        } catch (IOException e2) {
            throw new C12383l(e2.getMessage());
        }
    }
}
