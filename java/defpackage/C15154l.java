package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lٔۚۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15154l extends C11522l {
    public C15154l(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    /* JADX INFO: renamed from: return, reason: not valid java name */
    public static int m3940return(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    /* JADX INFO: renamed from: lؚۦ۠, reason: contains not printable characters */
    public final String m3941l() {
        int i;
        String str = (String) this.amazon;
        boolean zAdvert = advert();
        int i2 = this.loadAd;
        if (!zAdvert) {
            int iCharAt = str.charAt(i2);
            if (iCharAt == 45) {
                iCharAt = admob();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i2;
            } else {
                int iAdmob = admob();
                while (true) {
                    if ((iAdmob < 65 || iAdmob > 90) && ((iAdmob < 97 || iAdmob > 122) && !((iAdmob >= 48 && iAdmob <= 57) || iAdmob == 45 || iAdmob == 95))) {
                        break;
                    }
                    iAdmob = admob();
                }
                i = this.loadAd;
            }
            this.loadAd = i2;
            i2 = i;
        }
        int i3 = this.loadAd;
        if (i2 == i3) {
            return null;
        }
        String strSubstring = str.substring(i3, i2);
        this.loadAd = i2;
        return strSubstring;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:190:0x030f  */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:253:0x041b  */
    /* JADX WARN: Code duplicated, block: B:259:0x043a  */
    /* JADX WARN: Code duplicated, block: B:261:0x043e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0454  */
    /* JADX WARN: Code duplicated, block: B:269:0x0463  */
    /* JADX WARN: Code duplicated, block: B:285:0x045d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x0450 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v55 */
    /* JADX WARN: Type inference failed for: r10v56 */
    /* JADX WARN: Type inference failed for: r11v10, types: [lّۗۨ] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [lّۗۨ] */
    /* JADX WARN: Type inference failed for: r11v13, types: [lّۗۨ] */
    /* JADX WARN: Type inference failed for: r11v14, types: [lّۗۨ] */
    /* JADX WARN: Type inference failed for: r11v15, types: [lّۗۨ] */
    /* JADX WARN: Type inference failed for: r11v16, types: [lّۗۨ] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [lّۗۨ] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v12, types: [lٍۗؓ] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: lؙٗٙ, reason: contains not printable characters */
    public final ArrayList m3942l() {
        ArrayList arrayList;
        int i;
        ?? c12799l;
        boolean z;
        int i2;
        String strM3126throw;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        C8128l c8128lYandex;
        ?? r8;
        C9754l c9754l;
        Object obj;
        Object obj2;
        ArrayList arrayListM3942l;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj3;
        C3855l c3855l;
        String str = null;
        if (advert()) {
            return null;
        }
        ?? r3 = 1;
        ArrayList arrayList4 = new ArrayList(1);
        C2291l c2291l = new C2291l();
        while (!advert() && !advert()) {
            int i5 = this.loadAd;
            ArrayList arrayList5 = c2291l.yandex;
            int i6 = 2;
            boolean z4 = false;
            if (arrayList5 == null || arrayList5.isEmpty()) {
                i = 0;
            } else if (Signature('>')) {
                m3122super();
                i = 2;
            } else if (Signature('+')) {
                m3122super();
                i = 3;
            } else {
                i = 0;
            }
            if (Signature('*')) {
                c12799l = new C12799l(i, str);
            } else {
                String strM3941l = m3941l();
                if (strM3941l != null) {
                    C12799l c12799l2 = new C12799l(i, strM3941l);
                    c2291l.loadAd += r3;
                    c12799l = c12799l2;
                } else {
                    c12799l = str;
                }
            }
            while (!advert()) {
                if (Signature('.')) {
                    if (c12799l == 0) {
                        c12799l = new C12799l(i, str);
                    }
                    String strM3941l2 = m3941l();
                    if (strM3941l2 == null) {
                        throw new C16485l("Invalid \".class\" simpleSelectors");
                    }
                    c12799l.yandex("class", i6, strM3941l2);
                    c2291l.yandex();
                } else if (Signature('#')) {
                    if (c12799l == 0) {
                        c12799l = new C12799l(i, str);
                    }
                    String strM3941l3 = m3941l();
                    if (strM3941l3 == null) {
                        throw new C16485l("Invalid \"#id\" simpleSelectors");
                    }
                    c12799l.yandex("id", i6, strM3941l3);
                    c2291l.loadAd += 1000000;
                } else if (Signature('[')) {
                    if (c12799l == 0) {
                        c12799l = new C12799l(i, str);
                    }
                    m3122super();
                    String strM3941l4 = m3941l();
                    if (strM3941l4 == null) {
                        throw new C16485l("Invalid attribute simpleSelectors");
                    }
                    m3122super();
                    if (Signature('=')) {
                        i2 = i6;
                    } else if (license("~=")) {
                        i2 = 3;
                    } else {
                        i2 = license("|=") ? 4 : z4 ? 1 : 0;
                    }
                    if (i2 != 0) {
                        m3122super();
                        if (advert()) {
                            strM3126throw = str;
                        } else {
                            strM3126throw = m3126throw();
                            if (strM3126throw == null) {
                                strM3126throw = m3941l();
                            }
                        }
                        if (strM3126throw == null) {
                            throw new C16485l("Invalid attribute simpleSelectors");
                        }
                        m3122super();
                    } else {
                        strM3126throw = str;
                    }
                    if (!Signature(']')) {
                        throw new C16485l("Invalid attribute simpleSelectors");
                    }
                    if (i2 == 0) {
                        i2 = r3 == true ? 1 : 0;
                    }
                    c12799l.yandex(strM3941l4, i2, strM3126throw);
                    c2291l.yandex();
                } else {
                    c12799l = c12799l;
                    if (Signature(':')) {
                        if (c12799l == 0) {
                            c12799l = new C12799l(i, str);
                        }
                        String strM3941l5 = m3941l();
                        if (strM3941l5 == null) {
                            throw new C16485l("Invalid pseudo class");
                        }
                        EnumC9924l enumC9924l = (EnumC9924l) EnumC9924l.f20198l.get(strM3941l5);
                        if (enumC9924l == null) {
                            enumC9924l = EnumC9924l.f20199l;
                        }
                        switch (enumC9924l.ordinal()) {
                            case 0:
                                z2 = r3 == true ? 1 : 0;
                                i3 = 2;
                                C15742l c15742l = new C15742l(2);
                                c2291l.yandex();
                                obj3 = c15742l;
                                if (c12799l.amazon == null) {
                                    c12799l.amazon = new ArrayList();
                                }
                                c12799l.amazon.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 1:
                                z3 = true;
                                C15742l c15742l2 = new C15742l(1);
                                c2291l.yandex();
                                obj = c15742l2;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                if (c12799l.amazon == null) {
                                    c12799l.amazon = new ArrayList();
                                }
                                c12799l.amazon.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                boolean z5 = (enumC9924l == EnumC9924l.f20197l || enumC9924l == EnumC9924l.f20196l) ? r3 == true ? 1 : 0 : z4 ? 1 : 0;
                                boolean z6 = (enumC9924l == EnumC9924l.f20196l || enumC9924l == EnumC9924l.f20195l) ? r3 == true ? 1 : 0 : z4 ? 1 : 0;
                                int i7 = this.crashlytics;
                                String str2 = (String) this.amazon;
                                if (advert()) {
                                    r8 = str;
                                } else {
                                    int i8 = this.loadAd;
                                    if (Signature('(')) {
                                        m3122super();
                                        if (license("odd")) {
                                            c9754l = new C9754l(2, r3 == true ? 1 : 0, 2);
                                        } else if (license("even")) {
                                            c9754l = new C9754l(2, z4 ? 1 : 0, 2);
                                        } else {
                                            int i9 = (!Signature('+') && Signature('-')) ? -1 : r3 == true ? 1 : 0;
                                            C8128l c8128lYandex2 = C8128l.yandex(this.loadAd, i7, str2);
                                            if (c8128lYandex2 != null) {
                                                this.loadAd = c8128lYandex2.f16932l;
                                            }
                                            if (Signature('n') || Signature('N')) {
                                                if (c8128lYandex2 == null) {
                                                    c8128lYandex2 = new C8128l(1L, this.loadAd);
                                                }
                                                m3122super();
                                                boolean zSignature = Signature('+');
                                                i4 = (zSignature || !(zSignature = Signature('-'))) ? 1 : -1;
                                                if (zSignature) {
                                                    m3122super();
                                                    c8128lYandex = C8128l.yandex(this.loadAd, i7, str2);
                                                    if (c8128lYandex != null) {
                                                        this.loadAd = c8128lYandex.f16932l;
                                                    } else {
                                                        this.loadAd = i8;
                                                    }
                                                    r8 = 0;
                                                } else {
                                                    c8128lYandex = null;
                                                }
                                            } else {
                                                c8128lYandex = c8128lYandex2;
                                                i4 = i9 == true ? 1 : 0;
                                                c8128lYandex2 = null;
                                                i9 = 1;
                                            }
                                            c9754l = new C9754l(c8128lYandex2 == null ? 0 : i9 * ((int) c8128lYandex2.f16931l), c8128lYandex == 0 ? 0 : i4 * ((int) c8128lYandex.f16931l), 2);
                                        }
                                        m3122super();
                                        r8 = c9754l;
                                        if (!Signature(')')) {
                                            this.loadAd = i8;
                                            r8 = 0;
                                        }
                                    } else {
                                        r8 = str;
                                    }
                                }
                                if (r8 == 0) {
                                    throw new C16485l("Invalid or missing parameter section for pseudo class: ".concat(strM3941l5));
                                }
                                C2194l c2194l = new C2194l(r8.f19893l, r8.f19892l, z5, z6, c12799l.loadAd);
                                c2291l.yandex();
                                obj = c2194l;
                                z3 = true;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                if (c12799l.amazon == null) {
                                    c12799l.amazon = new ArrayList();
                                }
                                c12799l.amazon.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                                break;
                            case 6:
                                C2194l c2194l2 = new C2194l(0, 1, true, false, null);
                                c2291l.yandex();
                                z3 = r3 == true ? 1 : 0;
                                obj = c2194l2;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                if (c12799l.amazon == null) {
                                    c12799l.amazon = new ArrayList();
                                }
                                c12799l.amazon.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 7:
                                C2194l c2194l3 = new C2194l(0, 1, false, false, null);
                                c2291l.yandex();
                                z3 = r3 == true ? 1 : 0;
                                obj = c2194l3;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                if (c12799l.amazon == null) {
                                    c12799l.amazon = new ArrayList();
                                }
                                c12799l.amazon.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 8:
                                C2194l c2194l4 = new C2194l(0, 1, true, true, c12799l.loadAd);
                                c2291l.yandex();
                                z3 = r3 == true ? 1 : 0;
                                obj = c2194l4;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                if (c12799l.amazon == null) {
                                    c12799l.amazon = new ArrayList();
                                }
                                c12799l.amazon.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 9:
                                C2194l c2194l5 = new C2194l(0, 1, false, true, c12799l.loadAd);
                                c2291l.yandex();
                                z3 = r3 == true ? 1 : 0;
                                obj = c2194l5;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                if (c12799l.amazon == null) {
                                    c12799l.amazon = new ArrayList();
                                }
                                c12799l.amazon.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 10:
                                C13955l c13955l = new C13955l(str, z4);
                                c2291l.yandex();
                                obj2 = c13955l;
                                z3 = r3 == true ? 1 : 0;
                                obj = obj2;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                if (c12799l.amazon == null) {
                                    c12799l.amazon = new ArrayList();
                                }
                                c12799l.amazon.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 11:
                                C13955l c13955l2 = new C13955l(c12799l.loadAd, r3);
                                c2291l.yandex();
                                obj2 = c13955l2;
                                z3 = r3 == true ? 1 : 0;
                                obj = obj2;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                if (c12799l.amazon == null) {
                                    c12799l.amazon = new ArrayList();
                                }
                                c12799l.amazon.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 12:
                                C15742l c15742l3 = new C15742l(z4 ? 1 : 0);
                                c2291l.yandex();
                                obj2 = c15742l3;
                                z3 = r3 == true ? 1 : 0;
                                obj = obj2;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                if (c12799l.amazon == null) {
                                    c12799l.amazon = new ArrayList();
                                }
                                c12799l.amazon.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 13:
                                if (advert()) {
                                    arrayListM3942l = str;
                                } else {
                                    int i10 = this.loadAd;
                                    if (Signature('(')) {
                                        m3122super();
                                        arrayListM3942l = m3942l();
                                        if (arrayListM3942l != null && Signature(')')) {
                                            Iterator it = arrayListM3942l.iterator();
                                            while (it.hasNext() && (arrayList2 = ((C2291l) it.next()).yandex) != null) {
                                                Iterator it2 = arrayList2.iterator();
                                                while (true) {
                                                    if (it2.hasNext() && (arrayList3 = ((C12799l) it2.next()).amazon) != null) {
                                                        Iterator it3 = arrayList3.iterator();
                                                        while (true) {
                                                            if (it3.hasNext()) {
                                                                if (((InterfaceC7658l) it3.next()) instanceof C14581l) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.loadAd = i10;
                                        }
                                        arrayListM3942l = str;
                                    } else {
                                        arrayListM3942l = str;
                                    }
                                }
                                if (arrayListM3942l == null) {
                                    throw new C16485l("Invalid or missing parameter section for pseudo class: ".concat(strM3941l5));
                                }
                                C14581l c14581l = new C14581l();
                                c14581l.yandex = arrayListM3942l;
                                Iterator it4 = arrayListM3942l.iterator();
                                int i11 = RecyclerView.UNDEFINED_DURATION;
                                while (it4.hasNext()) {
                                    int i12 = ((C2291l) it4.next()).loadAd;
                                    if (i12 > i11) {
                                        i11 = i12;
                                    }
                                }
                                c2291l.loadAd = i11;
                                z3 = r3 == true ? 1 : 0;
                                obj = c14581l;
                                i3 = 2;
                                z2 = z3;
                                obj3 = obj;
                                if (c12799l.amazon == null) {
                                    c12799l.amazon = new ArrayList();
                                }
                                c12799l.amazon.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                                break;
                            case 14:
                                if (!advert()) {
                                    int i13 = this.loadAd;
                                    if (Signature('(')) {
                                        m3122super();
                                        ?? arrayList6 = str;
                                        while (true) {
                                            String strM3941l6 = m3941l();
                                            arrayList6 = arrayList6;
                                            if (strM3941l6 == null) {
                                                this.loadAd = i13;
                                            } else {
                                                if (arrayList6 == 0) {
                                                    arrayList6 = new ArrayList();
                                                }
                                                arrayList6.add(strM3941l6);
                                                m3122super();
                                                if (!m3110goto()) {
                                                    if (!Signature(')')) {
                                                        this.loadAd = i13;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C3855l c3855l2 = new C3855l(strM3941l5);
                                c2291l.yandex();
                                c3855l = c3855l2;
                                z2 = r3 == true ? 1 : 0;
                                i3 = i6;
                                obj3 = c3855l;
                                if (c12799l.amazon == null) {
                                    c12799l.amazon = new ArrayList();
                                }
                                c12799l.amazon.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            case 15:
                            case 16:
                            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                C3855l c3855l3 = new C3855l(strM3941l5);
                                c2291l.yandex();
                                c3855l = c3855l3;
                                z2 = r3 == true ? 1 : 0;
                                i3 = i6;
                                obj3 = c3855l;
                                if (c12799l.amazon == null) {
                                    c12799l.amazon = new ArrayList();
                                }
                                c12799l.amazon.add(obj3);
                                i6 = i3;
                                z4 = false;
                                r3 = z2;
                                str = null;
                                break;
                            default:
                                throw new C16485l("Unsupported pseudo class: ".concat(strM3941l5));
                        }
                    } else {
                        z = r3 == true ? 1 : 0;
                        if (c12799l != 0) {
                            this.loadAd = i5;
                            arrayList = c2291l.yandex;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                arrayList4.add(c2291l);
                            }
                            return arrayList4;
                        }
                        if (c2291l.yandex == null) {
                            c2291l.yandex = new ArrayList();
                        }
                        c2291l.yandex.add(c12799l);
                        if (!m3110goto()) {
                            arrayList4.add(c2291l);
                            c2291l = new C2291l();
                        }
                        r3 = z ? 1 : 0;
                        str = null;
                    }
                }
            }
            z = r3 == true ? 1 : 0;
            if (c12799l != 0) {
                this.loadAd = i5;
                arrayList = c2291l.yandex;
                if (arrayList != null) {
                    arrayList4.add(c2291l);
                }
                return arrayList4;
            }
            if (c2291l.yandex == null) {
                c2291l.yandex = new ArrayList();
            }
            c2291l.yandex.add(c12799l);
            if (!m3110goto()) {
                arrayList4.add(c2291l);
                c2291l = new C2291l();
            }
            r3 = z ? 1 : 0;
            str = null;
        }
        arrayList = c2291l.yandex;
        if (arrayList != null) {
            arrayList4.add(c2291l);
        }
        return arrayList4;
    }

    /* JADX INFO: renamed from: l٘ٚۥ, reason: contains not printable characters */
    public final String m3943l() {
        int iM3940return;
        if (advert()) {
            return null;
        }
        char cCharAt = ((String) this.amazon).charAt(this.loadAd);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.loadAd++;
        int iIntValue = m3118private().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = m3118private().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = m3118private().intValue();
                    } else {
                        int iM3940return2 = m3940return(iIntValue);
                        if (iM3940return2 != -1) {
                            for (int i = 1; i <= 5 && (iM3940return = m3940return((iIntValue = m3118private().intValue()))) != -1; i++) {
                                iM3940return2 = (iM3940return2 * 16) + iM3940return;
                            }
                            sb.append((char) iM3940return2);
                        }
                    }
                }
            }
            sb.append((char) iIntValue);
            iIntValue = m3118private().intValue();
        }
        return sb.toString();
    }
}
