package defpackage;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l٘ؓؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17633l extends AbstractC5070l {
    public int adcel;
    public final int firebase;
    public List metrica;
    public C17372l remoteconfig;
    public final C17372l[] smaato;
    public C5257l startapp;
    public List vip;
    public final C13143l admob = new C13143l();
    public final C5257l subs = new C5257l();
    public int isPro = -1;

    public C17633l(int i, List list) {
        this.firebase = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = AbstractC14501l.yandex;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.smaato = new C17372l[8];
        int i2 = 0;
        while (true) {
            C17372l[] c17372lArr = this.smaato;
            if (i2 >= 8) {
                this.remoteconfig = c17372lArr[0];
                return;
            } else {
                c17372lArr[i2] = new C17372l();
                i2++;
            }
        }
    }

    @Override // defpackage.AbstractC5070l
    public final C8341l billing() {
        List list = this.vip;
        this.metrica = list;
        list.getClass();
        return new C8341l(list);
    }

    public final List firebase() {
        Layout.Alignment alignment;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C17372l[] c17372lArr = this.smaato;
            C17372l c17372l = c17372lArr[i];
            if (c17372l.crashlytics && (!c17372l.yandex.isEmpty() || c17372l.loadAd.length() != 0)) {
                C17372l c17372l2 = c17372lArr[i];
                if (c17372l2.amazon) {
                    ArrayList arrayList2 = c17372l2.yandex;
                    C15588l c15588l = null;
                    if (c17372l2.crashlytics && (!arrayList2.isEmpty() || c17372l2.loadAd.length() != 0)) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) c17372l2.loadAd());
                        int i3 = c17372l2.firebase;
                        if (i3 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i3 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i3 != 2) {
                            if (i3 != 3) {
                                C10754l.smaato(c17372l2.firebase, "Unexpected justification value: ");
                                return null;
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        boolean z = c17372l2.billing;
                        int i4 = c17372l2.admob;
                        int i5 = c17372l2.mopub;
                        if (z) {
                            f = i4 / 99.0f;
                            f2 = i5 / 99.0f;
                        } else {
                            f = i4 / 209.0f;
                            f2 = i5 / 74.0f;
                        }
                        float f3 = (f * 0.9f) + 0.05f;
                        float f4 = (f2 * 0.9f) + 0.05f;
                        int i6 = c17372l2.subs;
                        int i7 = i6 / 3;
                        int i8 = i7 == 0 ? 0 : i7 == 1 ? 1 : 2;
                        int i9 = i6 % 3;
                        int i10 = i9 == 0 ? 0 : i9 == 1 ? 1 : 2;
                        int i11 = c17372l2.vip;
                        c15588l = new C15588l(spannableStringBuilder, alignment2, f4, i8, f3, i10, i11 != C17372l.pro, i11, c17372l2.purchase);
                    }
                    if (c15588l != null) {
                        arrayList.add(c15588l);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, C15588l.crashlytics);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((C15588l) arrayList.get(i12)).yandex);
        }
        return DesugarCollections.unmodifiableList(arrayList3);
    }

    @Override // defpackage.AbstractC5070l, defpackage.InterfaceC12313l
    public final void flush() {
        super.flush();
        this.vip = null;
        this.metrica = null;
        this.adcel = 0;
        this.remoteconfig = this.smaato[0];
        smaato();
        this.startapp = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:228:0x053d  */
    public final void isPro() {
        char c;
        boolean z;
        C5257l c5257l = this.startapp;
        if (c5257l == null) {
            return;
        }
        int i = 2;
        if (c5257l.purchase != (c5257l.amazon * 2) - 1) {
            AbstractC6427l.billing("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.startapp.amazon * 2) - 1) + ", but current index is " + this.startapp.purchase + " (sequence number " + this.startapp.crashlytics + ");");
        }
        C5257l c5257l2 = this.startapp;
        byte[] bArr = c5257l2.loadAd;
        int i2 = c5257l2.purchase;
        C5257l c5257l3 = this.subs;
        c5257l3.firebase(i2, bArr);
        boolean z2 = false;
        while (c5257l3.loadAd() > 0) {
            int i3 = 3;
            int iMopub = c5257l3.mopub(3);
            int iMopub2 = c5257l3.mopub(5);
            if (iMopub == 7) {
                c5257l3.metrica(i);
                iMopub = c5257l3.mopub(6);
                if (iMopub < 7) {
                    AbstractC12900l.subscription("Invalid extended service number: ", iMopub, "Cea708Decoder");
                }
            }
            if (iMopub2 == 0) {
                if (iMopub != 0) {
                    AbstractC6427l.vip("Cea708Decoder", "serviceNumber is non-zero (" + iMopub + ") when blockSize is 0");
                }
                if (z2) {
                    this.vip = firebase();
                }
                this.startapp = null;
            }
            if (iMopub != this.firebase) {
                c5257l3.startapp(iMopub2);
            } else {
                int iPurchase = (iMopub2 * 8) + c5257l3.purchase();
                while (c5257l3.purchase() < iPurchase) {
                    int iMopub3 = c5257l3.mopub(8);
                    if (iMopub3 != 16) {
                        if (iMopub3 <= 31) {
                            if (iMopub3 != 0) {
                                if (iMopub3 == i3) {
                                    this.vip = firebase();
                                } else if (iMopub3 != 8) {
                                    switch (iMopub3) {
                                        case 12:
                                            smaato();
                                            break;
                                        case 13:
                                            this.remoteconfig.yandex('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iMopub3 >= 17 && iMopub3 <= 23) {
                                                AbstractC6427l.vip("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iMopub3);
                                                c5257l3.metrica(8);
                                            } else if (iMopub3 < 24 || iMopub3 > 31) {
                                                AbstractC12900l.subscription("Invalid C0 command: ", iMopub3, "Cea708Decoder");
                                            } else {
                                                AbstractC6427l.vip("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iMopub3);
                                                c5257l3.metrica(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.remoteconfig.loadAd;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (iMopub3 <= 127) {
                            C17372l c17372l = this.remoteconfig;
                            if (iMopub3 == 127) {
                                c17372l.yandex((char) 9835);
                            } else {
                                c17372l.yandex((char) (iMopub3 & 255));
                            }
                            z2 = true;
                        } else {
                            if (iMopub3 <= 159) {
                                C17372l[] c17372lArr = this.smaato;
                                switch (iMopub3) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        z = true;
                                        int i4 = iMopub3 - 128;
                                        if (this.adcel != i4) {
                                            this.adcel = i4;
                                            this.remoteconfig = c17372lArr[i4];
                                        }
                                        break;
                                    case 136:
                                        z = true;
                                        for (int i5 = 1; i5 <= 8; i5++) {
                                            if (c5257l3.billing()) {
                                                C17372l c17372l2 = c17372lArr[8 - i5];
                                                c17372l2.yandex.clear();
                                                c17372l2.loadAd.clear();
                                                c17372l2.metrica = -1;
                                                c17372l2.startapp = -1;
                                                c17372l2.adcel = -1;
                                                c17372l2.subscription = -1;
                                                c17372l2.Signature = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (c5257l3.billing()) {
                                                c17372lArr[8 - i6].amazon = true;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 138:
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (c5257l3.billing()) {
                                                c17372lArr[8 - i7].amazon = false;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 139:
                                        for (int i8 = 1; i8 <= 8; i8++) {
                                            if (c5257l3.billing()) {
                                                C17372l c17372l3 = c17372lArr[8 - i8];
                                                c17372l3.amazon = !c17372l3.amazon;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 140:
                                        for (int i9 = 1; i9 <= 8; i9++) {
                                            if (c5257l3.billing()) {
                                                c17372lArr[8 - i9].amazon();
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 141:
                                        c5257l3.metrica(8);
                                        z = true;
                                        break;
                                    case 142:
                                        z = true;
                                        break;
                                    case 143:
                                        smaato();
                                        z = true;
                                        break;
                                    case 144:
                                        int i10 = i;
                                        if (this.remoteconfig.crashlytics) {
                                            c5257l3.mopub(4);
                                            c5257l3.mopub(i10);
                                            c5257l3.mopub(i10);
                                            boolean zBilling = c5257l3.billing();
                                            boolean zBilling2 = c5257l3.billing();
                                            i3 = 3;
                                            c5257l3.mopub(3);
                                            c5257l3.mopub(3);
                                            this.remoteconfig.purchase(zBilling, zBilling2);
                                            z = true;
                                        } else {
                                            c5257l3.metrica(16);
                                            z = true;
                                            i3 = 3;
                                        }
                                        break;
                                    case 145:
                                        if (this.remoteconfig.crashlytics) {
                                            int iCrashlytics = C17372l.crashlytics(c5257l3.mopub(2), c5257l3.mopub(2), c5257l3.mopub(2), c5257l3.mopub(2));
                                            int iCrashlytics2 = C17372l.crashlytics(c5257l3.mopub(2), c5257l3.mopub(2), c5257l3.mopub(2), c5257l3.mopub(2));
                                            c5257l3.metrica(2);
                                            C17372l.crashlytics(c5257l3.mopub(2), c5257l3.mopub(2), c5257l3.mopub(2), 0);
                                            this.remoteconfig.billing(iCrashlytics, iCrashlytics2);
                                        } else {
                                            c5257l3.metrica(24);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 146:
                                        if (this.remoteconfig.crashlytics) {
                                            c5257l3.metrica(4);
                                            int iMopub4 = c5257l3.mopub(4);
                                            c5257l3.metrica(2);
                                            c5257l3.mopub(6);
                                            C17372l c17372l4 = this.remoteconfig;
                                            if (c17372l4.Signature != iMopub4) {
                                                c17372l4.yandex('\n');
                                            }
                                            c17372l4.Signature = iMopub4;
                                        } else {
                                            c5257l3.metrica(16);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        AbstractC12900l.subscription("Invalid C1 command: ", iMopub3, "Cea708Decoder");
                                        z = true;
                                        break;
                                    case 151:
                                        if (this.remoteconfig.crashlytics) {
                                            int iCrashlytics3 = C17372l.crashlytics(c5257l3.mopub(2), c5257l3.mopub(2), c5257l3.mopub(2), c5257l3.mopub(2));
                                            c5257l3.mopub(2);
                                            C17372l.crashlytics(c5257l3.mopub(2), c5257l3.mopub(2), c5257l3.mopub(2), 0);
                                            c5257l3.billing();
                                            c5257l3.billing();
                                            c5257l3.mopub(2);
                                            c5257l3.mopub(2);
                                            int iMopub5 = c5257l3.mopub(2);
                                            c5257l3.metrica(8);
                                            C17372l c17372l5 = this.remoteconfig;
                                            c17372l5.vip = iCrashlytics3;
                                            c17372l5.firebase = iMopub5;
                                        } else {
                                            c5257l3.metrica(32);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i11 = iMopub3 - 152;
                                        C17372l c17372l6 = c17372lArr[i11];
                                        c5257l3.metrica(i);
                                        boolean zBilling3 = c5257l3.billing();
                                        c5257l3.metrica(i);
                                        int iMopub6 = c5257l3.mopub(i3);
                                        boolean zBilling4 = c5257l3.billing();
                                        int iMopub7 = c5257l3.mopub(7);
                                        int iMopub8 = c5257l3.mopub(8);
                                        int iMopub9 = c5257l3.mopub(4);
                                        int iMopub10 = c5257l3.mopub(4);
                                        c5257l3.metrica(i);
                                        c5257l3.metrica(6);
                                        c5257l3.metrica(i);
                                        int iMopub11 = c5257l3.mopub(3);
                                        int iMopub12 = c5257l3.mopub(3);
                                        ArrayList arrayList = c17372l6.yandex;
                                        c17372l6.crashlytics = true;
                                        c17372l6.amazon = zBilling3;
                                        c17372l6.purchase = iMopub6;
                                        c17372l6.billing = zBilling4;
                                        c17372l6.mopub = iMopub7;
                                        c17372l6.admob = iMopub8;
                                        c17372l6.subs = iMopub9;
                                        int i12 = iMopub10 + 1;
                                        if (c17372l6.isPro != i12) {
                                            c17372l6.isPro = i12;
                                            while (true) {
                                                if (arrayList.size() >= c17372l6.isPro || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (iMopub11 != 0 && c17372l6.smaato != iMopub11) {
                                            c17372l6.smaato = iMopub11;
                                            int i13 = iMopub11 - 1;
                                            int i14 = C17372l.premium[i13];
                                            boolean z3 = C17372l.signatures[i13];
                                            int i15 = C17372l.advert[i13];
                                            int i16 = C17372l.isVip[i13];
                                            int i17 = C17372l.ad[i13];
                                            c17372l6.vip = i14;
                                            c17372l6.firebase = i17;
                                        }
                                        if (iMopub12 != 0 && c17372l6.remoteconfig != iMopub12) {
                                            c17372l6.remoteconfig = iMopub12;
                                            int i18 = iMopub12 - 1;
                                            int i19 = C17372l.appmetrica[i18];
                                            int i20 = C17372l.applovin[i18];
                                            c17372l6.purchase(false, false);
                                            c17372l6.billing(C17372l.license, C17372l.inmobi[i18]);
                                        }
                                        if (this.adcel != i11) {
                                            this.adcel = i11;
                                            this.remoteconfig = c17372lArr[i11];
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                }
                            } else {
                                z = true;
                                if (iMopub3 <= 255) {
                                    this.remoteconfig.yandex((char) (iMopub3 & 255));
                                } else {
                                    AbstractC12900l.subscription("Invalid base command: ", iMopub3, "Cea708Decoder");
                                }
                                i = 2;
                                c = 7;
                            }
                            z2 = z;
                            i = 2;
                            c = 7;
                        }
                        c = 7;
                    } else {
                        int iMopub13 = c5257l3.mopub(8);
                        if (iMopub13 <= 31) {
                            c = 7;
                            if (iMopub13 > 7) {
                                if (iMopub13 <= 15) {
                                    c5257l3.metrica(8);
                                } else if (iMopub13 <= 23) {
                                    c5257l3.metrica(16);
                                } else if (iMopub13 <= 31) {
                                    c5257l3.metrica(24);
                                }
                            }
                        } else {
                            c = 7;
                            if (iMopub13 <= 127) {
                                if (iMopub13 == 32) {
                                    this.remoteconfig.yandex(' ');
                                } else if (iMopub13 == 33) {
                                    this.remoteconfig.yandex((char) 160);
                                } else if (iMopub13 == 37) {
                                    this.remoteconfig.yandex((char) 8230);
                                } else if (iMopub13 == 42) {
                                    this.remoteconfig.yandex((char) 352);
                                } else if (iMopub13 == 44) {
                                    this.remoteconfig.yandex((char) 338);
                                } else if (iMopub13 == 63) {
                                    this.remoteconfig.yandex((char) 376);
                                } else if (iMopub13 == 57) {
                                    this.remoteconfig.yandex((char) 8482);
                                } else if (iMopub13 == 58) {
                                    this.remoteconfig.yandex((char) 353);
                                } else if (iMopub13 == 60) {
                                    this.remoteconfig.yandex((char) 339);
                                } else if (iMopub13 != 61) {
                                    switch (iMopub13) {
                                        case 48:
                                            this.remoteconfig.yandex((char) 9608);
                                            break;
                                        case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                            this.remoteconfig.yandex((char) 8216);
                                            break;
                                        case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                            this.remoteconfig.yandex((char) 8217);
                                            break;
                                        case 51:
                                            this.remoteconfig.yandex((char) 8220);
                                            break;
                                        case 52:
                                            this.remoteconfig.yandex((char) 8221);
                                            break;
                                        case 53:
                                            this.remoteconfig.yandex((char) 8226);
                                            break;
                                        default:
                                            switch (iMopub13) {
                                                case 118:
                                                    this.remoteconfig.yandex((char) 8539);
                                                    break;
                                                case 119:
                                                    this.remoteconfig.yandex((char) 8540);
                                                    break;
                                                case 120:
                                                    this.remoteconfig.yandex((char) 8541);
                                                    break;
                                                case 121:
                                                    this.remoteconfig.yandex((char) 8542);
                                                    break;
                                                case 122:
                                                    this.remoteconfig.yandex((char) 9474);
                                                    break;
                                                case 123:
                                                    this.remoteconfig.yandex((char) 9488);
                                                    break;
                                                case 124:
                                                    this.remoteconfig.yandex((char) 9492);
                                                    break;
                                                case 125:
                                                    this.remoteconfig.yandex((char) 9472);
                                                    break;
                                                case 126:
                                                    this.remoteconfig.yandex((char) 9496);
                                                    break;
                                                case 127:
                                                    this.remoteconfig.yandex((char) 9484);
                                                    break;
                                                default:
                                                    AbstractC12900l.subscription("Invalid G2 character: ", iMopub13, "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.remoteconfig.yandex((char) 8480);
                                }
                                i = 2;
                                z2 = true;
                            } else if (iMopub13 > 159) {
                                i = 2;
                                if (iMopub13 <= 255) {
                                    if (iMopub13 == 160) {
                                        this.remoteconfig.yandex((char) 13252);
                                    } else {
                                        AbstractC12900l.subscription("Invalid G3 character: ", iMopub13, "Cea708Decoder");
                                        this.remoteconfig.yandex('_');
                                    }
                                    z2 = true;
                                } else {
                                    AbstractC12900l.subscription("Invalid extended command: ", iMopub13, "Cea708Decoder");
                                }
                            } else if (iMopub13 <= 135) {
                                c5257l3.metrica(32);
                            } else if (iMopub13 <= 143) {
                                c5257l3.metrica(40);
                            } else if (iMopub13 <= 159) {
                                i = 2;
                                c5257l3.metrica(2);
                                c5257l3.metrica(c5257l3.mopub(6) * 8);
                            }
                        }
                        i = 2;
                    }
                    i = i;
                }
            }
        }
        if (z2) {
            this.vip = firebase();
        }
        this.startapp = null;
    }

    @Override // defpackage.AbstractC5070l
    public final void mopub(C3875l c3875l) {
        ByteBuffer byteBuffer = c3875l.f8498l;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C13143l c13143l = this.admob;
        c13143l.m3565private(iLimit, bArrArray);
        while (c13143l.yandex() >= 3) {
            int iSignatures = c13143l.signatures();
            int i = iSignatures & 3;
            boolean z = (iSignatures & 4) == 4;
            byte bSignatures = (byte) c13143l.signatures();
            byte bSignatures2 = (byte) c13143l.signatures();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        isPro();
                        int i2 = (bSignatures & 192) >> 6;
                        int i3 = this.isPro;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            smaato();
                            AbstractC6427l.vip("Cea708Decoder", "Sequence number discontinuity. previous=" + this.isPro + " current=" + i2);
                        }
                        this.isPro = i2;
                        int i4 = bSignatures & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C5257l c5257l = new C5257l(i2, i4);
                        this.startapp = c5257l;
                        byte[] bArr = c5257l.loadAd;
                        c5257l.purchase = 1;
                        bArr[0] = bSignatures2;
                    } else {
                        AbstractC12442l.admob(i == 2);
                        C5257l c5257l2 = this.startapp;
                        if (c5257l2 == null) {
                            AbstractC6427l.admob("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c5257l2.loadAd;
                            int i5 = c5257l2.purchase;
                            int i6 = i5 + 1;
                            c5257l2.purchase = i6;
                            bArr2[i5] = bSignatures;
                            c5257l2.purchase = i5 + 2;
                            bArr2[i6] = bSignatures2;
                        }
                    }
                    C5257l c5257l3 = this.startapp;
                    if (c5257l3.purchase == (c5257l3.amazon * 2) - 1) {
                        isPro();
                    }
                }
            }
        }
    }

    public final void smaato() {
        for (int i = 0; i < 8; i++) {
            this.smaato[i].amazon();
        }
    }

    @Override // defpackage.AbstractC5070l
    public final boolean subs() {
        return this.vip != this.metrica;
    }
}
