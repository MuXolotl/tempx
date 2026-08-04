package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.format.Formatter;
import android.util.AttributeSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lّۤؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12953l {
    public static final int[] yandex = {R.attr.theme, ua.itaysonlab.vkx.R.attr.theme};
    public static final int[] loadAd = {ua.itaysonlab.vkx.R.attr.materialThemeOverlay};

    public static Context adcel(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, loadAd, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof C8288l) && ((C8288l) context).yandex == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C8288l c8288l = new C8288l(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, yandex);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c8288l.getTheme().applyStyle(resourceId2, true);
        }
        return c8288l;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017a  */
    /* JADX WARN: Code duplicated, block: B:102:0x018a  */
    /* JADX WARN: Code duplicated, block: B:103:0x018d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x019a  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01db  */
    /* JADX WARN: Code duplicated, block: B:118:0x01de  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:127:0x020f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0218  */
    /* JADX WARN: Code duplicated, block: B:132:0x022a  */
    /* JADX WARN: Code duplicated, block: B:135:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x0233  */
    /* JADX WARN: Code duplicated, block: B:139:0x0251  */
    /* JADX WARN: Code duplicated, block: B:143:0x0281  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x0120  */
    /* JADX WARN: Code duplicated, block: B:87:0x0137  */
    /* JADX WARN: Code duplicated, block: B:89:0x013a  */
    /* JADX WARN: Code duplicated, block: B:91:0x014a  */
    /* JADX WARN: Code duplicated, block: B:92:0x014c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x0155  */
    /* JADX WARN: Code duplicated, block: B:98:0x0171  */
    /* JADX WARN: Instruction removed from duplicated block: B:116:0x01db, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x0218, please report this as an issue */
    public static final void admob(C7091l c7091l, C5056l c5056l, Object obj, InterfaceC17242l interfaceC17242l, boolean z, InterfaceC17242l interfaceC17242l2, C15578l c15578l, C6956l c6956l, int i, int i2) {
        int i3;
        InterfaceC17242l interfaceC17242l3;
        int i4;
        boolean z2;
        int i5;
        C15578l c15578l2;
        int i6;
        C4346l c4346l;
        int i7;
        InterfaceC17242l interfaceC17242lMopub;
        int i8;
        boolean z3;
        Object objM2132native;
        C8610l c8610lMopub;
        C8610l c8610lMopub2;
        InterfaceC17242l interfaceC17242lPremium;
        int iOrdinal;
        boolean z4;
        Object objM2132native2;
        boolean z5;
        InterfaceC17242l interfaceC17242lLoadAd;
        boolean z6;
        Object objM2132native3;
        boolean z7;
        InterfaceC17242l interfaceC17242l4;
        int iOrdinal2;
        boolean z8;
        Object objM2132native4;
        boolean z9;
        InterfaceC17242l interfaceC17242lLoadAd2;
        boolean z10;
        Object objM2132native5;
        InterfaceC17242l interfaceC17242l5;
        C4224l c4224lAds;
        int i9;
        c6956l.m2133new(346306449);
        int i10 = 4;
        if ((i & 6) == 0) {
            i3 = (c6956l.billing(c7091l) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c6956l.billing(c5056l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c6956l.admob(obj) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 3072) == 0) {
                interfaceC17242l3 = interfaceC17242l;
                i3 |= c6956l.billing(interfaceC17242l3) ? 2048 : 1024;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    if (c6956l.mopub(z2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((196608 & i) == 0) {
                    i3 |= 65536;
                }
                if ((1572864 & i) == 0) {
                    c15578l2 = c15578l;
                    if (c6956l.admob(c15578l2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    c15578l2 = c15578l;
                }
                if ((599187 & i3) == 599186 || !c6956l.isVip()) {
                    c6956l.m2141switch();
                    i6 = i & 1;
                    c4346l = C4346l.f8873l;
                    if (i6 != 0 || c6956l.ad()) {
                        if (i11 != 0) {
                            interfaceC17242l3 = c4346l;
                        }
                        if (i4 != 0) {
                            z2 = true;
                        }
                        i7 = i3 & (-458753);
                        interfaceC17242lMopub = AbstractC5020l.mopub(c7091l);
                    } else {
                        c6956l.m2124else();
                        i7 = i3 & (-458753);
                        interfaceC17242lMopub = interfaceC17242l2;
                    }
                    c6956l.adcel();
                    c6956l.m2123default(-1662944388);
                    i8 = i7 & 112;
                    if (i8 == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objM2132native = c6956l.m2132native();
                    C13863l c13863l = C1867l.yandex;
                    if (z3 || objM2132native == c13863l) {
                        objM2132native = new C17921l(c5056l, i10);
                        c6956l.m2147try(objM2132native);
                    }
                    c6956l.startapp(false);
                    c8610lMopub = AbstractC8020l.mopub((Function0) objM2132native);
                    c8610lMopub2 = AbstractC8020l.mopub(new C4307l(obj, c5056l, 10));
                    int i12 = i7;
                    if (((Boolean) c8610lMopub2.getValue()).booleanValue()) {
                        c6956l.m2123default(-11550209);
                        C15924l c15924l = new C15924l(1.0f);
                        iOrdinal2 = ((EnumC7283l) c8610lMopub.getValue()).ordinal();
                        if (iOrdinal2 == 0) {
                            c6956l.m2123default(-1662936154);
                            c6956l.m2123default(-1662935720);
                            if (i8 == 32) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            objM2132native4 = c6956l.m2132native();
                            if (!z8 || objM2132native4 == c13863l) {
                                z9 = false;
                                objM2132native4 = new C16835l(c5056l, 0 == true ? 1 : 0);
                                c6956l.m2147try(objM2132native4);
                            } else {
                                z9 = false;
                            }
                            c6956l.startapp(z9);
                            interfaceC17242lLoadAd2 = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native4);
                            c6956l.startapp(z9);
                        } else {
                            if (iOrdinal2 != 1) {
                                throw AbstractC12900l.billing(-1663429177, c6956l, false);
                            }
                            c6956l.m2123default(-1662931418);
                            c6956l.m2123default(-1662930984);
                            if (i8 == 32) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objM2132native5 = c6956l.m2132native();
                            if (z10 || objM2132native5 == c13863l) {
                                objM2132native5 = new C16835l(c5056l, 1);
                                c6956l.m2147try(objM2132native5);
                            }
                            c6956l.startapp(false);
                            InterfaceC17242l interfaceC17242lLoadAd3 = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native5);
                            c6956l.startapp(false);
                            z9 = false;
                            interfaceC17242lLoadAd2 = interfaceC17242lLoadAd3;
                        }
                        interfaceC17242lPremium = c15924l.premium(interfaceC17242lLoadAd2);
                        c6956l.startapp(z9);
                    } else if (obj.equals(c5056l.subscription.getValue())) {
                        c6956l.m2123default(-11093021);
                        C15924l c15924l2 = new C15924l(1.0f);
                        iOrdinal = ((EnumC7283l) c8610lMopub.getValue()).ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                throw AbstractC12900l.billing(-1663429177, c6956l, false);
                            }
                            c6956l.m2123default(-1662916236);
                            c6956l.m2123default(-1662915802);
                            z6 = i8 == 32;
                            objM2132native3 = c6956l.m2132native();
                            if (z6 || objM2132native3 == c13863l) {
                                objM2132native3 = new C16835l(c5056l, 3);
                                c6956l.m2147try(objM2132native3);
                            }
                            z5 = false;
                            c6956l.startapp(false);
                            interfaceC17242lLoadAd = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native3);
                            c6956l.startapp(false);
                        } else {
                            c6956l.m2123default(-1662921420);
                            c6956l.m2123default(-1662920986);
                            z4 = i8 == 32;
                            objM2132native2 = c6956l.m2132native();
                            if (z4 || objM2132native2 == c13863l) {
                                objM2132native2 = new C16835l(c5056l, 2);
                                c6956l.m2147try(objM2132native2);
                            }
                            z5 = false;
                            c6956l.startapp(false);
                            interfaceC17242lLoadAd = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native2);
                            c6956l.startapp(false);
                        }
                        interfaceC17242lPremium = c15924l2.premium(interfaceC17242lLoadAd);
                        c6956l.startapp(z5);
                    } else {
                        c6956l.m2123default(-10663144);
                        c6956l.startapp(false);
                        interfaceC17242lPremium = interfaceC17242lMopub;
                    }
                    boolean z11 = z2;
                    AbstractC18296l.billing(c5056l, obj, interfaceC17242l3.premium(interfaceC17242lPremium), z11, ((Boolean) c8610lMopub2.getValue()).booleanValue(), c15578l2, c6956l, (i12 >> 3) & 466046);
                    z7 = z11;
                    interfaceC17242l4 = interfaceC17242lMopub;
                } else {
                    c6956l.m2124else();
                    interfaceC17242l4 = interfaceC17242l2;
                    z7 = z2;
                }
                interfaceC17242l5 = interfaceC17242l3;
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C4046l(c7091l, c5056l, obj, interfaceC17242l5, z7, interfaceC17242l4, c15578l, i, i2);
                }
            }
            i3 |= 24576;
            z2 = z;
            if ((196608 & i) == 0) {
                i3 |= 65536;
            }
            if ((1572864 & i) == 0) {
                c15578l2 = c15578l;
                if (c6956l.admob(c15578l2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                c15578l2 = c15578l;
            }
            if ((599187 & i3) == 599186) {
                c6956l.m2141switch();
                i6 = i & 1;
                c4346l = C4346l.f8873l;
                if (i6 != 0) {
                    if (i11 != 0) {
                        interfaceC17242l3 = c4346l;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i7 = i3 & (-458753);
                    interfaceC17242lMopub = AbstractC5020l.mopub(c7091l);
                } else {
                    if (i11 != 0) {
                        interfaceC17242l3 = c4346l;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i7 = i3 & (-458753);
                    interfaceC17242lMopub = AbstractC5020l.mopub(c7091l);
                }
                c6956l.adcel();
                c6956l.m2123default(-1662944388);
                i8 = i7 & 112;
                if (i8 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objM2132native = c6956l.m2132native();
                C13863l c13863l2 = C1867l.yandex;
                if (z3) {
                    objM2132native = new C17921l(c5056l, i10);
                    c6956l.m2147try(objM2132native);
                } else {
                    objM2132native = new C17921l(c5056l, i10);
                    c6956l.m2147try(objM2132native);
                }
                c6956l.startapp(false);
                c8610lMopub = AbstractC8020l.mopub((Function0) objM2132native);
                c8610lMopub2 = AbstractC8020l.mopub(new C4307l(obj, c5056l, 10));
                int i13 = i7;
                if (((Boolean) c8610lMopub2.getValue()).booleanValue()) {
                    c6956l.m2123default(-11550209);
                    C15924l c15924l3 = new C15924l(1.0f);
                    iOrdinal2 = ((EnumC7283l) c8610lMopub.getValue()).ordinal();
                    if (iOrdinal2 == 0) {
                        c6956l.m2123default(-1662936154);
                        c6956l.m2123default(-1662935720);
                        if (i8 == 32) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        objM2132native4 = c6956l.m2132native();
                        if (z8) {
                            z9 = false;
                            objM2132native4 = new C16835l(c5056l, 0 == true ? 1 : 0);
                            c6956l.m2147try(objM2132native4);
                        } else {
                            z9 = false;
                            objM2132native4 = new C16835l(c5056l, 0 == true ? 1 : 0);
                            c6956l.m2147try(objM2132native4);
                        }
                        c6956l.startapp(z9);
                        interfaceC17242lLoadAd2 = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native4);
                        c6956l.startapp(z9);
                    } else {
                        if (iOrdinal2 != 1) {
                            throw AbstractC12900l.billing(-1663429177, c6956l, false);
                        }
                        c6956l.m2123default(-1662931418);
                        c6956l.m2123default(-1662930984);
                        if (i8 == 32) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objM2132native5 = c6956l.m2132native();
                        if (z10) {
                            objM2132native5 = new C16835l(c5056l, 1);
                            c6956l.m2147try(objM2132native5);
                        } else {
                            objM2132native5 = new C16835l(c5056l, 1);
                            c6956l.m2147try(objM2132native5);
                        }
                        c6956l.startapp(false);
                        InterfaceC17242l interfaceC17242lLoadAd4 = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native5);
                        c6956l.startapp(false);
                        z9 = false;
                        interfaceC17242lLoadAd2 = interfaceC17242lLoadAd4;
                    }
                    interfaceC17242lPremium = c15924l3.premium(interfaceC17242lLoadAd2);
                    c6956l.startapp(z9);
                } else if (obj.equals(c5056l.subscription.getValue())) {
                    c6956l.m2123default(-11093021);
                    C15924l c15924l4 = new C15924l(1.0f);
                    iOrdinal = ((EnumC7283l) c8610lMopub.getValue()).ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw AbstractC12900l.billing(-1663429177, c6956l, false);
                        }
                        c6956l.m2123default(-1662916236);
                        c6956l.m2123default(-1662915802);
                        if (i8 == 32) {
                        }
                        objM2132native3 = c6956l.m2132native();
                        if (z6) {
                            objM2132native3 = new C16835l(c5056l, 3);
                            c6956l.m2147try(objM2132native3);
                        } else {
                            objM2132native3 = new C16835l(c5056l, 3);
                            c6956l.m2147try(objM2132native3);
                        }
                        z5 = false;
                        c6956l.startapp(false);
                        interfaceC17242lLoadAd = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native3);
                        c6956l.startapp(false);
                    } else {
                        c6956l.m2123default(-1662921420);
                        c6956l.m2123default(-1662920986);
                        if (i8 == 32) {
                        }
                        objM2132native2 = c6956l.m2132native();
                        if (z4) {
                            objM2132native2 = new C16835l(c5056l, 2);
                            c6956l.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C16835l(c5056l, 2);
                            c6956l.m2147try(objM2132native2);
                        }
                        z5 = false;
                        c6956l.startapp(false);
                        interfaceC17242lLoadAd = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native2);
                        c6956l.startapp(false);
                    }
                    interfaceC17242lPremium = c15924l4.premium(interfaceC17242lLoadAd);
                    c6956l.startapp(z5);
                } else {
                    c6956l.m2123default(-10663144);
                    c6956l.startapp(false);
                    interfaceC17242lPremium = interfaceC17242lMopub;
                }
                boolean z12 = z2;
                AbstractC18296l.billing(c5056l, obj, interfaceC17242l3.premium(interfaceC17242lPremium), z12, ((Boolean) c8610lMopub2.getValue()).booleanValue(), c15578l2, c6956l, (i13 >> 3) & 466046);
                z7 = z12;
                interfaceC17242l4 = interfaceC17242lMopub;
            } else {
                c6956l.m2141switch();
                i6 = i & 1;
                c4346l = C4346l.f8873l;
                if (i6 != 0) {
                    if (i11 != 0) {
                        interfaceC17242l3 = c4346l;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i7 = i3 & (-458753);
                    interfaceC17242lMopub = AbstractC5020l.mopub(c7091l);
                } else {
                    if (i11 != 0) {
                        interfaceC17242l3 = c4346l;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i7 = i3 & (-458753);
                    interfaceC17242lMopub = AbstractC5020l.mopub(c7091l);
                }
                c6956l.adcel();
                c6956l.m2123default(-1662944388);
                i8 = i7 & 112;
                if (i8 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objM2132native = c6956l.m2132native();
                C13863l c13863l3 = C1867l.yandex;
                if (z3) {
                    objM2132native = new C17921l(c5056l, i10);
                    c6956l.m2147try(objM2132native);
                } else {
                    objM2132native = new C17921l(c5056l, i10);
                    c6956l.m2147try(objM2132native);
                }
                c6956l.startapp(false);
                c8610lMopub = AbstractC8020l.mopub((Function0) objM2132native);
                c8610lMopub2 = AbstractC8020l.mopub(new C4307l(obj, c5056l, 10));
                int i14 = i7;
                if (((Boolean) c8610lMopub2.getValue()).booleanValue()) {
                    c6956l.m2123default(-11550209);
                    C15924l c15924l5 = new C15924l(1.0f);
                    iOrdinal2 = ((EnumC7283l) c8610lMopub.getValue()).ordinal();
                    if (iOrdinal2 == 0) {
                        c6956l.m2123default(-1662936154);
                        c6956l.m2123default(-1662935720);
                        if (i8 == 32) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        objM2132native4 = c6956l.m2132native();
                        if (z8) {
                            z9 = false;
                            objM2132native4 = new C16835l(c5056l, 0 == true ? 1 : 0);
                            c6956l.m2147try(objM2132native4);
                        } else {
                            z9 = false;
                            objM2132native4 = new C16835l(c5056l, 0 == true ? 1 : 0);
                            c6956l.m2147try(objM2132native4);
                        }
                        c6956l.startapp(z9);
                        interfaceC17242lLoadAd2 = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native4);
                        c6956l.startapp(z9);
                    } else {
                        if (iOrdinal2 != 1) {
                            throw AbstractC12900l.billing(-1663429177, c6956l, false);
                        }
                        c6956l.m2123default(-1662931418);
                        c6956l.m2123default(-1662930984);
                        if (i8 == 32) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objM2132native5 = c6956l.m2132native();
                        if (z10) {
                            objM2132native5 = new C16835l(c5056l, 1);
                            c6956l.m2147try(objM2132native5);
                        } else {
                            objM2132native5 = new C16835l(c5056l, 1);
                            c6956l.m2147try(objM2132native5);
                        }
                        c6956l.startapp(false);
                        InterfaceC17242l interfaceC17242lLoadAd5 = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native5);
                        c6956l.startapp(false);
                        z9 = false;
                        interfaceC17242lLoadAd2 = interfaceC17242lLoadAd5;
                    }
                    interfaceC17242lPremium = c15924l5.premium(interfaceC17242lLoadAd2);
                    c6956l.startapp(z9);
                } else if (obj.equals(c5056l.subscription.getValue())) {
                    c6956l.m2123default(-11093021);
                    C15924l c15924l6 = new C15924l(1.0f);
                    iOrdinal = ((EnumC7283l) c8610lMopub.getValue()).ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw AbstractC12900l.billing(-1663429177, c6956l, false);
                        }
                        c6956l.m2123default(-1662916236);
                        c6956l.m2123default(-1662915802);
                        if (i8 == 32) {
                        }
                        objM2132native3 = c6956l.m2132native();
                        if (z6) {
                            objM2132native3 = new C16835l(c5056l, 3);
                            c6956l.m2147try(objM2132native3);
                        } else {
                            objM2132native3 = new C16835l(c5056l, 3);
                            c6956l.m2147try(objM2132native3);
                        }
                        z5 = false;
                        c6956l.startapp(false);
                        interfaceC17242lLoadAd = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native3);
                        c6956l.startapp(false);
                    } else {
                        c6956l.m2123default(-1662921420);
                        c6956l.m2123default(-1662920986);
                        if (i8 == 32) {
                        }
                        objM2132native2 = c6956l.m2132native();
                        if (z4) {
                            objM2132native2 = new C16835l(c5056l, 2);
                            c6956l.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C16835l(c5056l, 2);
                            c6956l.m2147try(objM2132native2);
                        }
                        z5 = false;
                        c6956l.startapp(false);
                        interfaceC17242lLoadAd = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native2);
                        c6956l.startapp(false);
                    }
                    interfaceC17242lPremium = c15924l6.premium(interfaceC17242lLoadAd);
                    c6956l.startapp(z5);
                } else {
                    c6956l.m2123default(-10663144);
                    c6956l.startapp(false);
                    interfaceC17242lPremium = interfaceC17242lMopub;
                }
                boolean z13 = z2;
                AbstractC18296l.billing(c5056l, obj, interfaceC17242l3.premium(interfaceC17242lPremium), z13, ((Boolean) c8610lMopub2.getValue()).booleanValue(), c15578l2, c6956l, (i14 >> 3) & 466046);
                z7 = z13;
                interfaceC17242l4 = interfaceC17242lMopub;
            }
            interfaceC17242l5 = interfaceC17242l3;
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C4046l(c7091l, c5056l, obj, interfaceC17242l5, z7, interfaceC17242l4, c15578l, i, i2);
            }
        }
        i3 |= 3072;
        interfaceC17242l3 = interfaceC17242l;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                if (c6956l.mopub(z2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((196608 & i) == 0) {
                i3 |= 65536;
            }
            if ((1572864 & i) == 0) {
                c15578l2 = c15578l;
                if (c6956l.admob(c15578l2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            } else {
                c15578l2 = c15578l;
            }
            if ((599187 & i3) == 599186) {
                c6956l.m2141switch();
                i6 = i & 1;
                c4346l = C4346l.f8873l;
                if (i6 != 0) {
                    if (i11 != 0) {
                        interfaceC17242l3 = c4346l;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i7 = i3 & (-458753);
                    interfaceC17242lMopub = AbstractC5020l.mopub(c7091l);
                } else {
                    if (i11 != 0) {
                        interfaceC17242l3 = c4346l;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i7 = i3 & (-458753);
                    interfaceC17242lMopub = AbstractC5020l.mopub(c7091l);
                }
                c6956l.adcel();
                c6956l.m2123default(-1662944388);
                i8 = i7 & 112;
                if (i8 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objM2132native = c6956l.m2132native();
                C13863l c13863l4 = C1867l.yandex;
                if (z3) {
                    objM2132native = new C17921l(c5056l, i10);
                    c6956l.m2147try(objM2132native);
                } else {
                    objM2132native = new C17921l(c5056l, i10);
                    c6956l.m2147try(objM2132native);
                }
                c6956l.startapp(false);
                c8610lMopub = AbstractC8020l.mopub((Function0) objM2132native);
                c8610lMopub2 = AbstractC8020l.mopub(new C4307l(obj, c5056l, 10));
                int i15 = i7;
                if (((Boolean) c8610lMopub2.getValue()).booleanValue()) {
                    c6956l.m2123default(-11550209);
                    C15924l c15924l7 = new C15924l(1.0f);
                    iOrdinal2 = ((EnumC7283l) c8610lMopub.getValue()).ordinal();
                    if (iOrdinal2 == 0) {
                        c6956l.m2123default(-1662936154);
                        c6956l.m2123default(-1662935720);
                        if (i8 == 32) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        objM2132native4 = c6956l.m2132native();
                        if (z8) {
                            z9 = false;
                            objM2132native4 = new C16835l(c5056l, 0 == true ? 1 : 0);
                            c6956l.m2147try(objM2132native4);
                        } else {
                            z9 = false;
                            objM2132native4 = new C16835l(c5056l, 0 == true ? 1 : 0);
                            c6956l.m2147try(objM2132native4);
                        }
                        c6956l.startapp(z9);
                        interfaceC17242lLoadAd2 = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native4);
                        c6956l.startapp(z9);
                    } else {
                        if (iOrdinal2 != 1) {
                            throw AbstractC12900l.billing(-1663429177, c6956l, false);
                        }
                        c6956l.m2123default(-1662931418);
                        c6956l.m2123default(-1662930984);
                        if (i8 == 32) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objM2132native5 = c6956l.m2132native();
                        if (z10) {
                            objM2132native5 = new C16835l(c5056l, 1);
                            c6956l.m2147try(objM2132native5);
                        } else {
                            objM2132native5 = new C16835l(c5056l, 1);
                            c6956l.m2147try(objM2132native5);
                        }
                        c6956l.startapp(false);
                        InterfaceC17242l interfaceC17242lLoadAd6 = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native5);
                        c6956l.startapp(false);
                        z9 = false;
                        interfaceC17242lLoadAd2 = interfaceC17242lLoadAd6;
                    }
                    interfaceC17242lPremium = c15924l7.premium(interfaceC17242lLoadAd2);
                    c6956l.startapp(z9);
                } else if (obj.equals(c5056l.subscription.getValue())) {
                    c6956l.m2123default(-11093021);
                    C15924l c15924l8 = new C15924l(1.0f);
                    iOrdinal = ((EnumC7283l) c8610lMopub.getValue()).ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw AbstractC12900l.billing(-1663429177, c6956l, false);
                        }
                        c6956l.m2123default(-1662916236);
                        c6956l.m2123default(-1662915802);
                        if (i8 == 32) {
                        }
                        objM2132native3 = c6956l.m2132native();
                        if (z6) {
                            objM2132native3 = new C16835l(c5056l, 3);
                            c6956l.m2147try(objM2132native3);
                        } else {
                            objM2132native3 = new C16835l(c5056l, 3);
                            c6956l.m2147try(objM2132native3);
                        }
                        z5 = false;
                        c6956l.startapp(false);
                        interfaceC17242lLoadAd = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native3);
                        c6956l.startapp(false);
                    } else {
                        c6956l.m2123default(-1662921420);
                        c6956l.m2123default(-1662920986);
                        if (i8 == 32) {
                        }
                        objM2132native2 = c6956l.m2132native();
                        if (z4) {
                            objM2132native2 = new C16835l(c5056l, 2);
                            c6956l.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C16835l(c5056l, 2);
                            c6956l.m2147try(objM2132native2);
                        }
                        z5 = false;
                        c6956l.startapp(false);
                        interfaceC17242lLoadAd = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native2);
                        c6956l.startapp(false);
                    }
                    interfaceC17242lPremium = c15924l8.premium(interfaceC17242lLoadAd);
                    c6956l.startapp(z5);
                } else {
                    c6956l.m2123default(-10663144);
                    c6956l.startapp(false);
                    interfaceC17242lPremium = interfaceC17242lMopub;
                }
                boolean z14 = z2;
                AbstractC18296l.billing(c5056l, obj, interfaceC17242l3.premium(interfaceC17242lPremium), z14, ((Boolean) c8610lMopub2.getValue()).booleanValue(), c15578l2, c6956l, (i15 >> 3) & 466046);
                z7 = z14;
                interfaceC17242l4 = interfaceC17242lMopub;
            } else {
                c6956l.m2141switch();
                i6 = i & 1;
                c4346l = C4346l.f8873l;
                if (i6 != 0) {
                    if (i11 != 0) {
                        interfaceC17242l3 = c4346l;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i7 = i3 & (-458753);
                    interfaceC17242lMopub = AbstractC5020l.mopub(c7091l);
                } else {
                    if (i11 != 0) {
                        interfaceC17242l3 = c4346l;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    i7 = i3 & (-458753);
                    interfaceC17242lMopub = AbstractC5020l.mopub(c7091l);
                }
                c6956l.adcel();
                c6956l.m2123default(-1662944388);
                i8 = i7 & 112;
                if (i8 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objM2132native = c6956l.m2132native();
                C13863l c13863l5 = C1867l.yandex;
                if (z3) {
                    objM2132native = new C17921l(c5056l, i10);
                    c6956l.m2147try(objM2132native);
                } else {
                    objM2132native = new C17921l(c5056l, i10);
                    c6956l.m2147try(objM2132native);
                }
                c6956l.startapp(false);
                c8610lMopub = AbstractC8020l.mopub((Function0) objM2132native);
                c8610lMopub2 = AbstractC8020l.mopub(new C4307l(obj, c5056l, 10));
                int i16 = i7;
                if (((Boolean) c8610lMopub2.getValue()).booleanValue()) {
                    c6956l.m2123default(-11550209);
                    C15924l c15924l9 = new C15924l(1.0f);
                    iOrdinal2 = ((EnumC7283l) c8610lMopub.getValue()).ordinal();
                    if (iOrdinal2 == 0) {
                        c6956l.m2123default(-1662936154);
                        c6956l.m2123default(-1662935720);
                        if (i8 == 32) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        objM2132native4 = c6956l.m2132native();
                        if (z8) {
                            z9 = false;
                            objM2132native4 = new C16835l(c5056l, 0 == true ? 1 : 0);
                            c6956l.m2147try(objM2132native4);
                        } else {
                            z9 = false;
                            objM2132native4 = new C16835l(c5056l, 0 == true ? 1 : 0);
                            c6956l.m2147try(objM2132native4);
                        }
                        c6956l.startapp(z9);
                        interfaceC17242lLoadAd2 = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native4);
                        c6956l.startapp(z9);
                    } else {
                        if (iOrdinal2 != 1) {
                            throw AbstractC12900l.billing(-1663429177, c6956l, false);
                        }
                        c6956l.m2123default(-1662931418);
                        c6956l.m2123default(-1662930984);
                        if (i8 == 32) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objM2132native5 = c6956l.m2132native();
                        if (z10) {
                            objM2132native5 = new C16835l(c5056l, 1);
                            c6956l.m2147try(objM2132native5);
                        } else {
                            objM2132native5 = new C16835l(c5056l, 1);
                            c6956l.m2147try(objM2132native5);
                        }
                        c6956l.startapp(false);
                        InterfaceC17242l interfaceC17242lLoadAd7 = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native5);
                        c6956l.startapp(false);
                        z9 = false;
                        interfaceC17242lLoadAd2 = interfaceC17242lLoadAd7;
                    }
                    interfaceC17242lPremium = c15924l9.premium(interfaceC17242lLoadAd2);
                    c6956l.startapp(z9);
                } else if (obj.equals(c5056l.subscription.getValue())) {
                    c6956l.m2123default(-11093021);
                    C15924l c15924l10 = new C15924l(1.0f);
                    iOrdinal = ((EnumC7283l) c8610lMopub.getValue()).ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            throw AbstractC12900l.billing(-1663429177, c6956l, false);
                        }
                        c6956l.m2123default(-1662916236);
                        c6956l.m2123default(-1662915802);
                        if (i8 == 32) {
                        }
                        objM2132native3 = c6956l.m2132native();
                        if (z6) {
                            objM2132native3 = new C16835l(c5056l, 3);
                            c6956l.m2147try(objM2132native3);
                        } else {
                            objM2132native3 = new C16835l(c5056l, 3);
                            c6956l.m2147try(objM2132native3);
                        }
                        z5 = false;
                        c6956l.startapp(false);
                        interfaceC17242lLoadAd = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native3);
                        c6956l.startapp(false);
                    } else {
                        c6956l.m2123default(-1662921420);
                        c6956l.m2123default(-1662920986);
                        if (i8 == 32) {
                        }
                        objM2132native2 = c6956l.m2132native();
                        if (z4) {
                            objM2132native2 = new C16835l(c5056l, 2);
                            c6956l.m2147try(objM2132native2);
                        } else {
                            objM2132native2 = new C16835l(c5056l, 2);
                            c6956l.m2147try(objM2132native2);
                        }
                        z5 = false;
                        c6956l.startapp(false);
                        interfaceC17242lLoadAd = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native2);
                        c6956l.startapp(false);
                    }
                    interfaceC17242lPremium = c15924l10.premium(interfaceC17242lLoadAd);
                    c6956l.startapp(z5);
                } else {
                    c6956l.m2123default(-10663144);
                    c6956l.startapp(false);
                    interfaceC17242lPremium = interfaceC17242lMopub;
                }
                boolean z15 = z2;
                AbstractC18296l.billing(c5056l, obj, interfaceC17242l3.premium(interfaceC17242lPremium), z15, ((Boolean) c8610lMopub2.getValue()).booleanValue(), c15578l2, c6956l, (i16 >> 3) & 466046);
                z7 = z15;
                interfaceC17242l4 = interfaceC17242lMopub;
            }
            interfaceC17242l5 = interfaceC17242l3;
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C4046l(c7091l, c5056l, obj, interfaceC17242l5, z7, interfaceC17242l4, c15578l, i, i2);
            }
        }
        i3 |= 24576;
        z2 = z;
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            c15578l2 = c15578l;
            if (c6956l.admob(c15578l2)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        } else {
            c15578l2 = c15578l;
        }
        if ((599187 & i3) == 599186) {
            c6956l.m2141switch();
            i6 = i & 1;
            c4346l = C4346l.f8873l;
            if (i6 != 0) {
                if (i11 != 0) {
                    interfaceC17242l3 = c4346l;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                i7 = i3 & (-458753);
                interfaceC17242lMopub = AbstractC5020l.mopub(c7091l);
            } else {
                if (i11 != 0) {
                    interfaceC17242l3 = c4346l;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                i7 = i3 & (-458753);
                interfaceC17242lMopub = AbstractC5020l.mopub(c7091l);
            }
            c6956l.adcel();
            c6956l.m2123default(-1662944388);
            i8 = i7 & 112;
            if (i8 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            objM2132native = c6956l.m2132native();
            C13863l c13863l6 = C1867l.yandex;
            if (z3) {
                objM2132native = new C17921l(c5056l, i10);
                c6956l.m2147try(objM2132native);
            } else {
                objM2132native = new C17921l(c5056l, i10);
                c6956l.m2147try(objM2132native);
            }
            c6956l.startapp(false);
            c8610lMopub = AbstractC8020l.mopub((Function0) objM2132native);
            c8610lMopub2 = AbstractC8020l.mopub(new C4307l(obj, c5056l, 10));
            int i17 = i7;
            if (((Boolean) c8610lMopub2.getValue()).booleanValue()) {
                c6956l.m2123default(-11550209);
                C15924l c15924l11 = new C15924l(1.0f);
                iOrdinal2 = ((EnumC7283l) c8610lMopub.getValue()).ordinal();
                if (iOrdinal2 == 0) {
                    c6956l.m2123default(-1662936154);
                    c6956l.m2123default(-1662935720);
                    if (i8 == 32) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    objM2132native4 = c6956l.m2132native();
                    if (z8) {
                        z9 = false;
                        objM2132native4 = new C16835l(c5056l, 0 == true ? 1 : 0);
                        c6956l.m2147try(objM2132native4);
                    } else {
                        z9 = false;
                        objM2132native4 = new C16835l(c5056l, 0 == true ? 1 : 0);
                        c6956l.m2147try(objM2132native4);
                    }
                    c6956l.startapp(z9);
                    interfaceC17242lLoadAd2 = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native4);
                    c6956l.startapp(z9);
                } else {
                    if (iOrdinal2 != 1) {
                        throw AbstractC12900l.billing(-1663429177, c6956l, false);
                    }
                    c6956l.m2123default(-1662931418);
                    c6956l.m2123default(-1662930984);
                    if (i8 == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objM2132native5 = c6956l.m2132native();
                    if (z10) {
                        objM2132native5 = new C16835l(c5056l, 1);
                        c6956l.m2147try(objM2132native5);
                    } else {
                        objM2132native5 = new C16835l(c5056l, 1);
                        c6956l.m2147try(objM2132native5);
                    }
                    c6956l.startapp(false);
                    InterfaceC17242l interfaceC17242lLoadAd8 = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native5);
                    c6956l.startapp(false);
                    z9 = false;
                    interfaceC17242lLoadAd2 = interfaceC17242lLoadAd8;
                }
                interfaceC17242lPremium = c15924l11.premium(interfaceC17242lLoadAd2);
                c6956l.startapp(z9);
            } else if (obj.equals(c5056l.subscription.getValue())) {
                c6956l.m2123default(-11093021);
                C15924l c15924l12 = new C15924l(1.0f);
                iOrdinal = ((EnumC7283l) c8610lMopub.getValue()).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw AbstractC12900l.billing(-1663429177, c6956l, false);
                    }
                    c6956l.m2123default(-1662916236);
                    c6956l.m2123default(-1662915802);
                    if (i8 == 32) {
                    }
                    objM2132native3 = c6956l.m2132native();
                    if (z6) {
                        objM2132native3 = new C16835l(c5056l, 3);
                        c6956l.m2147try(objM2132native3);
                    } else {
                        objM2132native3 = new C16835l(c5056l, 3);
                        c6956l.m2147try(objM2132native3);
                    }
                    z5 = false;
                    c6956l.startapp(false);
                    interfaceC17242lLoadAd = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native3);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(-1662921420);
                    c6956l.m2123default(-1662920986);
                    if (i8 == 32) {
                    }
                    objM2132native2 = c6956l.m2132native();
                    if (z4) {
                        objM2132native2 = new C16835l(c5056l, 2);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        objM2132native2 = new C16835l(c5056l, 2);
                        c6956l.m2147try(objM2132native2);
                    }
                    z5 = false;
                    c6956l.startapp(false);
                    interfaceC17242lLoadAd = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native2);
                    c6956l.startapp(false);
                }
                interfaceC17242lPremium = c15924l12.premium(interfaceC17242lLoadAd);
                c6956l.startapp(z5);
            } else {
                c6956l.m2123default(-10663144);
                c6956l.startapp(false);
                interfaceC17242lPremium = interfaceC17242lMopub;
            }
            boolean z16 = z2;
            AbstractC18296l.billing(c5056l, obj, interfaceC17242l3.premium(interfaceC17242lPremium), z16, ((Boolean) c8610lMopub2.getValue()).booleanValue(), c15578l2, c6956l, (i17 >> 3) & 466046);
            z7 = z16;
            interfaceC17242l4 = interfaceC17242lMopub;
        } else {
            c6956l.m2141switch();
            i6 = i & 1;
            c4346l = C4346l.f8873l;
            if (i6 != 0) {
                if (i11 != 0) {
                    interfaceC17242l3 = c4346l;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                i7 = i3 & (-458753);
                interfaceC17242lMopub = AbstractC5020l.mopub(c7091l);
            } else {
                if (i11 != 0) {
                    interfaceC17242l3 = c4346l;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                i7 = i3 & (-458753);
                interfaceC17242lMopub = AbstractC5020l.mopub(c7091l);
            }
            c6956l.adcel();
            c6956l.m2123default(-1662944388);
            i8 = i7 & 112;
            if (i8 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            objM2132native = c6956l.m2132native();
            C13863l c13863l7 = C1867l.yandex;
            if (z3) {
                objM2132native = new C17921l(c5056l, i10);
                c6956l.m2147try(objM2132native);
            } else {
                objM2132native = new C17921l(c5056l, i10);
                c6956l.m2147try(objM2132native);
            }
            c6956l.startapp(false);
            c8610lMopub = AbstractC8020l.mopub((Function0) objM2132native);
            c8610lMopub2 = AbstractC8020l.mopub(new C4307l(obj, c5056l, 10));
            int i18 = i7;
            if (((Boolean) c8610lMopub2.getValue()).booleanValue()) {
                c6956l.m2123default(-11550209);
                C15924l c15924l13 = new C15924l(1.0f);
                iOrdinal2 = ((EnumC7283l) c8610lMopub.getValue()).ordinal();
                if (iOrdinal2 == 0) {
                    c6956l.m2123default(-1662936154);
                    c6956l.m2123default(-1662935720);
                    if (i8 == 32) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    objM2132native4 = c6956l.m2132native();
                    if (z8) {
                        z9 = false;
                        objM2132native4 = new C16835l(c5056l, 0 == true ? 1 : 0);
                        c6956l.m2147try(objM2132native4);
                    } else {
                        z9 = false;
                        objM2132native4 = new C16835l(c5056l, 0 == true ? 1 : 0);
                        c6956l.m2147try(objM2132native4);
                    }
                    c6956l.startapp(z9);
                    interfaceC17242lLoadAd2 = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native4);
                    c6956l.startapp(z9);
                } else {
                    if (iOrdinal2 != 1) {
                        throw AbstractC12900l.billing(-1663429177, c6956l, false);
                    }
                    c6956l.m2123default(-1662931418);
                    c6956l.m2123default(-1662930984);
                    if (i8 == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objM2132native5 = c6956l.m2132native();
                    if (z10) {
                        objM2132native5 = new C16835l(c5056l, 1);
                        c6956l.m2147try(objM2132native5);
                    } else {
                        objM2132native5 = new C16835l(c5056l, 1);
                        c6956l.m2147try(objM2132native5);
                    }
                    c6956l.startapp(false);
                    InterfaceC17242l interfaceC17242lLoadAd9 = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native5);
                    c6956l.startapp(false);
                    z9 = false;
                    interfaceC17242lLoadAd2 = interfaceC17242lLoadAd9;
                }
                interfaceC17242lPremium = c15924l13.premium(interfaceC17242lLoadAd2);
                c6956l.startapp(z9);
            } else if (obj.equals(c5056l.subscription.getValue())) {
                c6956l.m2123default(-11093021);
                C15924l c15924l14 = new C15924l(1.0f);
                iOrdinal = ((EnumC7283l) c8610lMopub.getValue()).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw AbstractC12900l.billing(-1663429177, c6956l, false);
                    }
                    c6956l.m2123default(-1662916236);
                    c6956l.m2123default(-1662915802);
                    if (i8 == 32) {
                    }
                    objM2132native3 = c6956l.m2132native();
                    if (z6) {
                        objM2132native3 = new C16835l(c5056l, 3);
                        c6956l.m2147try(objM2132native3);
                    } else {
                        objM2132native3 = new C16835l(c5056l, 3);
                        c6956l.m2147try(objM2132native3);
                    }
                    z5 = false;
                    c6956l.startapp(false);
                    interfaceC17242lLoadAd = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native3);
                    c6956l.startapp(false);
                } else {
                    c6956l.m2123default(-1662921420);
                    c6956l.m2123default(-1662920986);
                    if (i8 == 32) {
                    }
                    objM2132native2 = c6956l.m2132native();
                    if (z4) {
                        objM2132native2 = new C16835l(c5056l, 2);
                        c6956l.m2147try(objM2132native2);
                    } else {
                        objM2132native2 = new C16835l(c5056l, 2);
                        c6956l.m2147try(objM2132native2);
                    }
                    z5 = false;
                    c6956l.startapp(false);
                    interfaceC17242lLoadAd = AbstractC7477l.loadAd(c4346l, (Function1) objM2132native2);
                    c6956l.startapp(false);
                }
                interfaceC17242lPremium = c15924l14.premium(interfaceC17242lLoadAd);
                c6956l.startapp(z5);
            } else {
                c6956l.m2123default(-10663144);
                c6956l.startapp(false);
                interfaceC17242lPremium = interfaceC17242lMopub;
            }
            boolean z17 = z2;
            AbstractC18296l.billing(c5056l, obj, interfaceC17242l3.premium(interfaceC17242lPremium), z17, ((Boolean) c8610lMopub2.getValue()).booleanValue(), c15578l2, c6956l, (i18 >> 3) & 466046);
            z7 = z17;
            interfaceC17242l4 = interfaceC17242lMopub;
        }
        interfaceC17242l5 = interfaceC17242l3;
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C4046l(c7091l, c5056l, obj, interfaceC17242l5, z7, interfaceC17242l4, c15578l, i, i2);
        }
    }

    public static final long amazon(long j) {
        long j2 = j << 32;
        int i = C9735l.smaato;
        return j2;
    }

    public static final void billing(C12097l c12097l, C6956l c6956l, int i) {
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(1461960980);
        int i2 = i | (c6956l2.billing(c12097l) ? 4 : 2);
        if (c6956l2.m2127for(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) c6956l2.isPro(AbstractC1242l.loadAd);
            float f = c12097l.crashlytics;
            long j = c12097l.yandex;
            long j2 = c12097l.loadAd;
            InterfaceC12244l interfaceC12244lLoadAd = AbstractC16245l.loadAd(f, null, "", null, c6956l2, 3072, 22);
            boolean zPurchase = c6956l2.purchase(j2) | c6956l2.purchase(j);
            Object objM2132native = c6956l2.m2132native();
            if (zPurchase || objM2132native == C1867l.yandex) {
                objM2132native = Formatter.formatFileSize(context, j2) + " / " + Formatter.formatFileSize(context, j);
                c6956l2.m2147try(objM2132native);
            }
            String str = (String) objM2132native;
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36044l, c6956l2, 6);
            long j3 = c6956l2.f14595continue;
            int i3 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, c4346l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l2, c5062lYandex, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l2, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l2, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, c6415l4);
            AbstractC4597l.loadAd(AbstractC16759l.crashlytics(ua.itaysonlab.vkx.R.drawable.ic_download_cloud_outline_28, 0, c6956l2), null, null, ((C14370l) c6956l2.isPro(AbstractC16964l.yandex)).yandex.adcel, c6956l, 56, 4);
            C1853l c1853lYandex = AbstractC1001l.yandex(new C7537l(8.0f, true, new C8339l(12)), C18450l.f36046l, c6956l, 6);
            long j4 = c6956l.f14595continue;
            int i4 = (int) (j4 ^ (j4 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, c4346l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            AbstractC13010l.loadAd(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262142);
            c6956l2 = c6956l;
            if (j2 == 0 && j == 0 && c12097l.crashlytics == 0.0f) {
                c6956l2.m2123default(-1719819949);
                AbstractC4332l.amazon(AbstractC0080l.amazon(c4346l, 1.0f), 0L, 0L, 0, 0.0f, c6956l2, 6, 30);
                c6956l2.startapp(false);
            } else {
                c6956l2.m2123default(-1719684510);
                AbstractC4332l.crashlytics(((Number) interfaceC12244lLoadAd.getValue()).floatValue(), 0, 48, 0L, 0L, c6956l2, AbstractC0080l.amazon(c4346l, 1.0f));
                c6956l2.startapp(false);
            }
            c6956l2.startapp(true);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C15583l(c12097l, i, 2);
        }
    }

    public static final long crashlytics(int i, int i2, int i3, int i4) {
        return loadAd(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static final long firebase(long j, long j2) {
        float f;
        float f2;
        long jYandex = C9735l.yandex(j, C9735l.billing(j2));
        float fAmazon = C9735l.amazon(j2);
        float fAmazon2 = C9735l.amazon(jYandex);
        float f3 = 1.0f - fAmazon2;
        float f4 = (fAmazon * f3) + fAmazon2;
        float fAdmob = C9735l.admob(jYandex);
        float fAdmob2 = C9735l.admob(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((fAdmob2 * fAmazon) * f3) + (fAdmob * fAmazon2)) / f4;
        }
        float fMopub = C9735l.mopub(jYandex);
        float fMopub2 = C9735l.mopub(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((fMopub2 * fAmazon) * f3) + (fMopub * fAmazon2)) / f4;
        }
        float fPurchase = C9735l.purchase(jYandex);
        float fPurchase2 = C9735l.purchase(j2);
        if (f4 != 0.0f) {
            f5 = (((fPurchase2 * fAmazon) * f3) + (fPurchase * fAmazon2)) / f4;
        }
        return subs(f, f2, f5, f4, C9735l.billing(j2));
    }

    public static final void isPro(C12097l c12097l, boolean z, Function0 function0, C6956l c6956l, int i) {
        c6956l.m2133new(-1024827486);
        int i2 = (c6956l.billing(c12097l) ? 4 : 2) | i | (c6956l.mopub(z) ? 32 : 16) | (c6956l.admob(function0) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c6956l.m2127for(i2 & 1, (i2 & 147) != 146)) {
            float fYandex = ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).yandex(c6956l) + 16.0f;
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lMetrica = AbstractC3605l.metrica(c4346l, 16.0f, 16.0f, 16.0f, fYandex);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, interfaceC17242lMetrica);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i3), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            mopub(z, function0, c6956l, (i2 >> 3) & 126);
            AbstractC9334l.yandex(c6956l, AbstractC0080l.purchase(c4346l, 16.0f));
            billing(c12097l, c6956l, i2 & 14);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C16693l(c12097l, z, function0, i, 6);
        }
    }

    public static final long loadAd(int i) {
        long j = ((long) i) << 32;
        int i2 = C9735l.smaato;
        return j;
    }

    public static final C5056l metrica(C5866l c5866l, Function4 function4, C6956l c6956l) {
        C6415l c6415l;
        c6956l.m2123default(-645045624);
        C17253l c17253l = new C17253l(0.0f, 0.0f, 0.0f, 0.0f);
        c6956l.m2123default(1347434050);
        boolean zBilling = c6956l.billing(c5866l);
        Object objM2132native = c6956l.m2132native();
        Object obj = C1867l.yandex;
        int i = 0;
        if (zBilling || objM2132native == obj) {
            objM2132native = new C13496l(c5866l, i);
            c6956l.m2147try(objM2132native);
        }
        Function0 function0 = (Function0) objM2132native;
        c6956l.startapp(false);
        c6956l.m2123default(996643712);
        Object objM2132native2 = c6956l.m2132native();
        if (objM2132native2 == obj) {
            Object c0417l = new C0417l(AbstractC12311l.isPro(c6956l));
            c6956l.m2147try(c0417l);
            objM2132native2 = c0417l;
        }
        InterfaceC2262l interfaceC2262l = ((C0417l) objM2132native2).f1535l;
        InterfaceC8714l interfaceC8714lVip = AbstractC8020l.vip(function0, c6956l);
        InterfaceC8714l interfaceC8714lVip2 = AbstractC8020l.vip(100L, c6956l);
        c6956l.m2123default(1852585201);
        boolean zPurchase = c6956l.purchase(100L) | c6956l.billing(c5866l) | c6956l.billing(interfaceC2262l);
        Object objM2132native3 = c6956l.m2132native();
        if (zPurchase || objM2132native3 == obj) {
            objM2132native3 = new C1316l(c5866l, interfaceC2262l, new C4307l(interfaceC8714lVip, interfaceC8714lVip2, 11));
            c6956l.m2147try(objM2132native3);
        }
        C1316l c1316l = (C1316l) objM2132native3;
        c6956l.startapp(false);
        c6956l.startapp(false);
        InterfaceC13490l interfaceC13490l = (InterfaceC13490l) c6956l.isPro(AbstractC4751l.admob);
        float fMo868instanceof = interfaceC13490l.mo868instanceof(48.0f);
        Object objM2132native4 = c6956l.m2132native();
        if (objM2132native4 == obj) {
            Object c0417l2 = new C0417l(AbstractC12311l.isPro(c6956l));
            c6956l.m2147try(c0417l2);
            objM2132native4 = c0417l2;
        }
        InterfaceC2262l interfaceC2262l2 = ((C0417l) objM2132native4).f1535l;
        InterfaceC8714l interfaceC8714lVip3 = AbstractC8020l.vip(function4, c6956l);
        EnumC9931l enumC9931l = (EnumC9931l) c6956l.isPro(AbstractC4751l.vip);
        C13352l c13352l = new C13352l(interfaceC13490l.mo868instanceof(AbstractC3605l.billing(c17253l, enumC9931l)), interfaceC13490l.mo868instanceof(AbstractC3605l.purchase(c17253l, enumC9931l)), interfaceC13490l.mo868instanceof(0.0f), interfaceC13490l.mo868instanceof(0.0f));
        c6956l.m2123default(1347465600);
        boolean zBilling2 = c6956l.billing(c5866l);
        Object objM2132native5 = c6956l.m2132native();
        int i2 = 1;
        if (zBilling2 || objM2132native5 == obj) {
            objM2132native5 = new C13496l(c5866l, i2);
            c6956l.m2147try(objM2132native5);
        }
        c6956l.startapp(false);
        C8610l c8610lMopub = AbstractC8020l.mopub((Function0) objM2132native5);
        Object obj2 = (EnumC7283l) c8610lMopub.getValue();
        c6956l.m2123default(1347468268);
        boolean zBilling3 = c6956l.billing(c17253l) | c6956l.crashlytics(48.0f) | c6956l.billing(interfaceC2262l2) | c6956l.billing(c5866l) | c6956l.billing(c1316l) | c6956l.billing(obj2);
        Object objM2132native6 = c6956l.m2132native();
        if (zBilling3 || objM2132native6 == obj) {
            int iOrdinal = ((EnumC7283l) c8610lMopub.getValue()).ordinal();
            if (iOrdinal == 0) {
                c6415l = C6415l.f13411l;
            } else {
                if (iOrdinal != 1) {
                    C18725l.billing();
                    return null;
                }
                c6415l = C6415l.f13417l;
            }
            Object c5056l = new C5056l(new C5138l(26, c5866l), interfaceC2262l2, interfaceC8714lVip3, fMo868instanceof, c13352l, c1316l, enumC9931l, c6415l);
            c6956l.m2147try(c5056l);
            objM2132native6 = c5056l;
        }
        C5056l c5056l2 = (C5056l) objM2132native6;
        c6956l.startapp(false);
        c6956l.startapp(false);
        return c5056l2;
    }

    public static final void mopub(boolean z, Function0 function0, C6956l c6956l, int i) {
        int i2;
        boolean z2;
        C6956l c6956l2 = c6956l;
        c6956l2.m2133new(862348506);
        if ((i & 6) == 0) {
            i2 = i | (c6956l2.mopub(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c6956l2.admob(function0) ? 32 : 16;
        }
        int i3 = i2;
        if (c6956l2.m2127for(i3 & 1, (i3 & 19) != 18)) {
            C5062l c5062lYandex = AbstractC7001l.yandex(AbstractC8313l.yandex, C18450l.f36040l, c6956l2, 48);
            long j = c6956l2.f14595continue;
            int i4 = (int) ((j >>> 32) ^ j);
            InterfaceC18556l interfaceC18556lSmaato = c6956l2.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l2, C4346l.f8873l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l2.m2140super();
            if (c6956l2.f14603switch) {
                c6956l2.firebase(c16395l);
            } else {
                c6956l2.m2136protected();
            }
            AbstractC8182l.billing(c6956l2, c5062lYandex, C3438l.mopub);
            AbstractC8182l.billing(c6956l2, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l2, Integer.valueOf(i4), C3438l.isPro);
            AbstractC8182l.purchase(c6956l2, C3438l.firebase);
            AbstractC8182l.billing(c6956l2, interfaceC17242lBilling, C3438l.amazon);
            String strPurchase = AbstractC11999l.purchase(c6956l2, ua.itaysonlab.vkx.R.string.ota_card_downloading);
            C10707l c10707l = AbstractC16964l.yandex;
            AbstractC13010l.loadAd(strPurchase, null, ((C14370l) c6956l2.isPro(c10707l)).yandex.adcel, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C14370l) c6956l2.isPro(c10707l)).loadAd.purchase, c6956l, 0, 0, 131066);
            c6956l2 = c6956l;
            AbstractC9334l.yandex(c6956l2, new C9247l(1.0f, true));
            if (z) {
                c6956l2.m2123default(-1808166933);
                AbstractC7470l.billing(function0, null, false, null, null, null, AbstractC16947l.yandex, c6956l2, ((i3 >> 3) & 14) | 1572864, 62);
                z2 = false;
            } else {
                z2 = false;
                c6956l2.m2123default(-1811491156);
            }
            c6956l2.startapp(z2);
            c6956l2.startapp(true);
        } else {
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C12784l(z, function0, i, 2);
        }
    }

    public static final long remoteconfig(long j, long j2, float f) {
        C5709l c5709l = C3955l.ad;
        long jYandex = C9735l.yandex(j, c5709l);
        long jYandex2 = C9735l.yandex(j2, c5709l);
        float fAmazon = C9735l.amazon(jYandex);
        float fAdmob = C9735l.admob(jYandex);
        float fMopub = C9735l.mopub(jYandex);
        float fPurchase = C9735l.purchase(jYandex);
        float fAmazon2 = C9735l.amazon(jYandex2);
        float fAdmob2 = C9735l.admob(jYandex2);
        float fMopub2 = C9735l.mopub(jYandex2);
        float fPurchase2 = C9735l.purchase(jYandex2);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return C9735l.yandex(subs(AbstractC7572l.firebase(fAdmob, fAdmob2, f), AbstractC7572l.firebase(fMopub, fMopub2, f), AbstractC7572l.firebase(fPurchase, fPurchase2, f), AbstractC7572l.firebase(fAmazon, fAmazon2, f), c5709l), C9735l.billing(j2));
    }

    public static C0861l smaato(InterfaceC13012l interfaceC13012l) {
        return new C0861l(1, interfaceC13012l);
    }

    public static final int startapp(long j) {
        float[] fArr = C3955l.yandex;
        return (int) (C9735l.yandex(j, C3955l.purchase) >>> 32);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:68:0x0108  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    public static final long subs(float f, float f2, float f3, float f4, AbstractC11833l abstractC11833l) {
        int i;
        int i2;
        int i3;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (abstractC11833l.crashlytics()) {
            long j = ((long) ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f)))) << 32;
            int i18 = C9735l.smaato;
            return j;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(f);
        int i19 = iFloatToRawIntBits3 >>> 31;
        int i20 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i21 = iFloatToRawIntBits3 & 8388607;
        int i22 = 49;
        int i23 = AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
        int i24 = 0;
        if (i20 == 255) {
            i2 = i21 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i20 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else {
                if (i > 0) {
                    int i25 = i21 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i3 = (((i << 10) | i25) + 1) | (i19 << 15);
                    } else {
                        i2 = i25;
                    }
                    short s = (short) i3;
                    iFloatToRawIntBits = Float.floatToRawIntBits(f2);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i7 = 49;
                            i9 = 0;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) i10;
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    i15 = i13 - 112;
                                    if (i15 < 31) {
                                        if (i15 <= 0) {
                                            i24 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i16 = (((i15 << 10) | i24) + 1) | (i12 << 15);
                                            } else {
                                                i22 = i15;
                                            }
                                        } else if (i15 >= -10) {
                                            i17 = (i14 | 8388608) >> (1 - i15);
                                            if ((i17 & 4096) != 0) {
                                                i17 += 8192;
                                            }
                                            i22 = 0;
                                            i24 = i17 >> 13;
                                        } else {
                                            i22 = 0;
                                        }
                                    }
                                    long jMax = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC11833l.crashlytics) & 63);
                                    int i26 = C9735l.smaato;
                                    return jMax;
                                }
                                if (i14 == 0) {
                                    i23 = 0;
                                }
                                i24 = i23;
                                i22 = 31;
                                i16 = (i12 << 15) | (i22 << 10) | i24;
                                long jMax2 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC11833l.crashlytics) & 63);
                                int i27 = C9735l.smaato;
                                return jMax2;
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & 4096) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    i10 = i9 | (i4 << 15) | (i7 << 10);
                    short s3 = (short) i10;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i24 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i16 = (((i15 << 10) | i24) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i24 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        long jMax3 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC11833l.crashlytics) & 63);
                        int i28 = C9735l.smaato;
                        return jMax3;
                    }
                    if (i14 == 0) {
                        i23 = 0;
                    }
                    i24 = i23;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i24;
                    long jMax4 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s) & 65535) << 48) | ((((long) s3) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC11833l.crashlytics) & 63);
                    int i29 = C9735l.smaato;
                    return jMax4;
                }
                if (i >= -10) {
                    int i30 = (i21 | 8388608) >> (1 - i);
                    if ((i30 & 4096) != 0) {
                        i30 += 8192;
                    }
                    i2 = i30 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = i2 | (i19 << 15) | (i << 10);
        short s4 = (short) i3;
        iFloatToRawIntBits = Float.floatToRawIntBits(f2);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i7 = 49;
                i9 = 0;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                    } else {
                        i9 = i8;
                    }
                    short s5 = (short) i10;
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i15 = i13 - 112;
                        if (i15 < 31) {
                            if (i15 <= 0) {
                                i24 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i16 = (((i15 << 10) | i24) + 1) | (i12 << 15);
                                } else {
                                    i22 = i15;
                                }
                            } else if (i15 >= -10) {
                                i17 = (i14 | 8388608) >> (1 - i15);
                                if ((i17 & 4096) != 0) {
                                    i17 += 8192;
                                }
                                i22 = 0;
                                i24 = i17 >> 13;
                            } else {
                                i22 = 0;
                            }
                        }
                        long jMax5 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC11833l.crashlytics) & 63);
                        int i210 = C9735l.smaato;
                        return jMax5;
                    }
                    if (i14 == 0) {
                        i23 = 0;
                    }
                    i24 = i23;
                    i22 = 31;
                    i16 = (i12 << 15) | (i22 << 10) | i24;
                    long jMax6 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC11833l.crashlytics) & 63);
                    int i211 = C9735l.smaato;
                    return jMax6;
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & 4096) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        i10 = i9 | (i4 << 15) | (i7 << 10);
        short s6 = (short) i10;
        iFloatToRawIntBits2 = Float.floatToRawIntBits(f3);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            i15 = i13 - 112;
            if (i15 < 31) {
                if (i15 <= 0) {
                    i24 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i16 = (((i15 << 10) | i24) + 1) | (i12 << 15);
                    } else {
                        i22 = i15;
                    }
                } else if (i15 >= -10) {
                    i17 = (i14 | 8388608) >> (1 - i15);
                    if ((i17 & 4096) != 0) {
                        i17 += 8192;
                    }
                    i22 = 0;
                    i24 = i17 >> 13;
                } else {
                    i22 = 0;
                }
            }
            long jMax7 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC11833l.crashlytics) & 63);
            int i212 = C9735l.smaato;
            return jMax7;
        }
        if (i14 == 0) {
            i23 = 0;
        }
        i24 = i23;
        i22 = 31;
        i16 = (i12 << 15) | (i22 << 10) | i24;
        long jMax8 = ((((long) ((short) i16)) & 65535) << 16) | ((((long) s4) & 65535) << 48) | ((((long) s6) & 65535) << 32) | ((((long) ((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) abstractC11833l.crashlytics) & 63);
        int i213 = C9735l.smaato;
        return jMax8;
    }

    public static final float vip(long j) {
        AbstractC11833l abstractC11833lBilling = C9735l.billing(j);
        if (!AbstractC9843l.mopub(abstractC11833lBilling.loadAd, 12884901888L)) {
            AbstractC11597l.yandex("The specified color must be encoded in an RGB color space. The supplied color space is ".concat(AbstractC9843l.firebase(abstractC11833lBilling.loadAd)));
        }
        C8646l c8646l = ((C0777l) abstractC11833lBilling).startapp;
        double dAmazon = c8646l.amazon(C9735l.admob(j));
        float fAmazon = (float) ((c8646l.amazon(C9735l.purchase(j)) * 0.0722d) + (c8646l.amazon(C9735l.mopub(j)) * 0.7152d) + (dAmazon * 0.2126d));
        if (fAmazon < 0.0f) {
            fAmazon = 0.0f;
        }
        if (fAmazon > 1.0f) {
            return 1.0f;
        }
        return fAmazon;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0145  */
    /* JADX WARN: Code duplicated, block: B:106:0x015c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0163  */
    /* JADX WARN: Code duplicated, block: B:113:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0172  */
    /* JADX WARN: Code duplicated, block: B:116:0x0177  */
    /* JADX WARN: Code duplicated, block: B:118:0x017b  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0181 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0183  */
    /* JADX WARN: Code duplicated, block: B:123:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0191  */
    /* JADX WARN: Code duplicated, block: B:126:0x0193  */
    /* JADX WARN: Code duplicated, block: B:128:0x0199  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:83:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0111  */
    /* JADX WARN: Code duplicated, block: B:85:0x0114  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0123  */
    /* JADX WARN: Code duplicated, block: B:94:0x012c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0132  */
    /* JADX WARN: Code duplicated, block: B:97:0x0135  */
    /* JADX WARN: Code duplicated, block: B:99:0x013b  */
    public static final long yandex(float f, float f2, float f3, float f4, AbstractC11833l abstractC11833l) {
        int i;
        int i2;
        int i3;
        float fLoadAd;
        float fYandex;
        int iFloatToRawIntBits;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float fLoadAd2;
        float fYandex2;
        int iFloatToRawIntBits2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f5;
        if (abstractC11833l.crashlytics()) {
            float f6 = f4 < 0.0f ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i20 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f < 0.0f ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i21 = i20 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i22 = i21 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            long j = ((long) (i22 | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i23 = C9735l.smaato;
            return j;
        }
        if (((int) (abstractC11833l.loadAd >> 32)) != 3) {
            AbstractC11597l.yandex("Color only works with ColorSpaces with 3 components");
        }
        int i24 = abstractC11833l.crashlytics;
        if (i24 == -1) {
            AbstractC11597l.yandex("Unknown color space, please use a color space in ColorSpaces");
        }
        int i25 = 0;
        float fLoadAd3 = abstractC11833l.loadAd(0);
        float fYandex3 = abstractC11833l.yandex(0);
        if (f >= fLoadAd3) {
            fLoadAd3 = f;
        }
        if (fLoadAd3 <= fYandex3) {
            fYandex3 = fLoadAd3;
        }
        int iFloatToRawIntBits3 = Float.floatToRawIntBits(fYandex3);
        int i26 = iFloatToRawIntBits3 >>> 31;
        int i27 = (iFloatToRawIntBits3 >>> 23) & 255;
        int i28 = iFloatToRawIntBits3 & 8388607;
        if (i27 == 255) {
            i2 = i28 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i27 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else {
                if (i > 0) {
                    int i29 = i28 >> 13;
                    if ((iFloatToRawIntBits3 & 4096) != 0) {
                        i3 = (((i << 10) | i29) + 1) | (i26 << 15);
                    } else {
                        i2 = i29;
                    }
                    short s = (short) i3;
                    fLoadAd = abstractC11833l.loadAd(1);
                    fYandex = abstractC11833l.yandex(1);
                    if (f2 >= fLoadAd) {
                        fLoadAd = f2;
                    }
                    if (fLoadAd <= fYandex) {
                        fYandex = fLoadAd;
                    }
                    iFloatToRawIntBits = Float.floatToRawIntBits(fYandex);
                    i4 = iFloatToRawIntBits >>> 31;
                    i5 = (iFloatToRawIntBits >>> 23) & 255;
                    i6 = iFloatToRawIntBits & 8388607;
                    if (i5 == 255) {
                        if (i6 != 0) {
                            i9 = 512;
                        } else {
                            i9 = 0;
                        }
                        i7 = 31;
                    } else {
                        i7 = i5 - 112;
                        if (i7 >= 31) {
                            i9 = 0;
                            i7 = 49;
                        } else {
                            if (i7 <= 0) {
                                i8 = i6 >> 13;
                                if ((iFloatToRawIntBits & 4096) != 0) {
                                    i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                                } else {
                                    i9 = i8;
                                }
                                short s2 = (short) i10;
                                fLoadAd2 = abstractC11833l.loadAd(2);
                                fYandex2 = abstractC11833l.yandex(2);
                                if (f3 >= fLoadAd2) {
                                    fLoadAd2 = f3;
                                }
                                if (fLoadAd2 <= fYandex2) {
                                    fYandex2 = fLoadAd2;
                                }
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(fYandex2);
                                i12 = iFloatToRawIntBits2 >>> 31;
                                i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                                i14 = 8388607 & iFloatToRawIntBits2;
                                if (i13 == 255) {
                                    i17 = i14 != 0 ? 512 : 0;
                                    i25 = 31;
                                } else {
                                    i15 = i13 - 112;
                                    if (i15 >= 31) {
                                        i17 = 0;
                                        i25 = 49;
                                    } else {
                                        if (i15 <= 0) {
                                            i16 = i14 >> 13;
                                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                                i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                            } else {
                                                i17 = i16;
                                                i25 = i15;
                                            }
                                            short s3 = (short) i18;
                                            f5 = f4 >= 0.0f ? f4 : 0.0f;
                                            long j2 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s3)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                            int i30 = C9735l.smaato;
                                            return j2;
                                        }
                                        if (i15 >= -10) {
                                            i19 = (i14 | 8388608) >> (1 - i15);
                                            if ((i19 & 4096) != 0) {
                                                i19 += 8192;
                                            }
                                            i17 = i19 >> 13;
                                        } else {
                                            i17 = 0;
                                        }
                                    }
                                }
                                i18 = i17 | (i12 << 15) | (i25 << 10);
                                short s4 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j3 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s2) & 65535) << 32) | ((65535 & ((long) s4)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i31 = C9735l.smaato;
                                return j3;
                            }
                            if (i7 >= -10) {
                                i11 = (i6 | 8388608) >> (1 - i7);
                                if ((i11 & 4096) != 0) {
                                    i11 += 8192;
                                }
                                i9 = i11 >> 13;
                                i7 = 0;
                            } else {
                                i9 = 0;
                                i7 = 0;
                            }
                        }
                    }
                    i10 = i9 | (i4 << 15) | (i7 << 10);
                    short s5 = (short) i10;
                    fLoadAd2 = abstractC11833l.loadAd(2);
                    fYandex2 = abstractC11833l.yandex(2);
                    if (f3 >= fLoadAd2) {
                        fLoadAd2 = f3;
                    }
                    if (fLoadAd2 <= fYandex2) {
                        fYandex2 = fLoadAd2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fYandex2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i25 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i25 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i25 = i15;
                                }
                                short s6 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j4 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s6)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i32 = C9735l.smaato;
                                return j4;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i25 << 10);
                    short s7 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j5 = (((long) i24) & 63) | ((((long) s) & 65535) << 48) | ((((long) s5) & 65535) << 32) | ((65535 & ((long) s7)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i33 = C9735l.smaato;
                    return j5;
                }
                if (i >= -10) {
                    int i34 = (i28 | 8388608) >> (1 - i);
                    if ((i34 & 4096) != 0) {
                        i34 += 8192;
                    }
                    i2 = i34 >> 13;
                    i = 0;
                } else {
                    i2 = 0;
                    i = 0;
                }
            }
        }
        i3 = i2 | (i26 << 15) | (i << 10);
        short s8 = (short) i3;
        fLoadAd = abstractC11833l.loadAd(1);
        fYandex = abstractC11833l.yandex(1);
        if (f2 >= fLoadAd) {
            fLoadAd = f2;
        }
        if (fLoadAd <= fYandex) {
            fYandex = fLoadAd;
        }
        iFloatToRawIntBits = Float.floatToRawIntBits(fYandex);
        i4 = iFloatToRawIntBits >>> 31;
        i5 = (iFloatToRawIntBits >>> 23) & 255;
        i6 = iFloatToRawIntBits & 8388607;
        if (i5 == 255) {
            if (i6 != 0) {
                i9 = 512;
            } else {
                i9 = 0;
            }
            i7 = 31;
        } else {
            i7 = i5 - 112;
            if (i7 >= 31) {
                i9 = 0;
                i7 = 49;
            } else {
                if (i7 <= 0) {
                    i8 = i6 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i10 = (((i7 << 10) | i8) + 1) | (i4 << 15);
                    } else {
                        i9 = i8;
                    }
                    short s9 = (short) i10;
                    fLoadAd2 = abstractC11833l.loadAd(2);
                    fYandex2 = abstractC11833l.yandex(2);
                    if (f3 >= fLoadAd2) {
                        fLoadAd2 = f3;
                    }
                    if (fLoadAd2 <= fYandex2) {
                        fYandex2 = fLoadAd2;
                    }
                    iFloatToRawIntBits2 = Float.floatToRawIntBits(fYandex2);
                    i12 = iFloatToRawIntBits2 >>> 31;
                    i13 = (iFloatToRawIntBits2 >>> 23) & 255;
                    i14 = 8388607 & iFloatToRawIntBits2;
                    if (i13 == 255) {
                        i17 = i14 != 0 ? 512 : 0;
                        i25 = 31;
                    } else {
                        i15 = i13 - 112;
                        if (i15 >= 31) {
                            i17 = 0;
                            i25 = 49;
                        } else {
                            if (i15 <= 0) {
                                i16 = i14 >> 13;
                                if ((iFloatToRawIntBits2 & 4096) != 0) {
                                    i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                                } else {
                                    i17 = i16;
                                    i25 = i15;
                                }
                                short s10 = (short) i18;
                                if (f4 >= 0.0f) {
                                }
                                long j6 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s10)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                                int i35 = C9735l.smaato;
                                return j6;
                            }
                            if (i15 >= -10) {
                                i19 = (i14 | 8388608) >> (1 - i15);
                                if ((i19 & 4096) != 0) {
                                    i19 += 8192;
                                }
                                i17 = i19 >> 13;
                            } else {
                                i17 = 0;
                            }
                        }
                    }
                    i18 = i17 | (i12 << 15) | (i25 << 10);
                    short s11 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j7 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s9) & 65535) << 32) | ((65535 & ((long) s11)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i36 = C9735l.smaato;
                    return j7;
                }
                if (i7 >= -10) {
                    i11 = (i6 | 8388608) >> (1 - i7);
                    if ((i11 & 4096) != 0) {
                        i11 += 8192;
                    }
                    i9 = i11 >> 13;
                    i7 = 0;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
            }
        }
        i10 = i9 | (i4 << 15) | (i7 << 10);
        short s12 = (short) i10;
        fLoadAd2 = abstractC11833l.loadAd(2);
        fYandex2 = abstractC11833l.yandex(2);
        if (f3 >= fLoadAd2) {
            fLoadAd2 = f3;
        }
        if (fLoadAd2 <= fYandex2) {
            fYandex2 = fLoadAd2;
        }
        iFloatToRawIntBits2 = Float.floatToRawIntBits(fYandex2);
        i12 = iFloatToRawIntBits2 >>> 31;
        i13 = (iFloatToRawIntBits2 >>> 23) & 255;
        i14 = 8388607 & iFloatToRawIntBits2;
        if (i13 == 255) {
            i17 = i14 != 0 ? 512 : 0;
            i25 = 31;
        } else {
            i15 = i13 - 112;
            if (i15 >= 31) {
                i17 = 0;
                i25 = 49;
            } else {
                if (i15 <= 0) {
                    i16 = i14 >> 13;
                    if ((iFloatToRawIntBits2 & 4096) != 0) {
                        i18 = (((i15 << 10) | i16) + 1) | (i12 << 15);
                    } else {
                        i17 = i16;
                        i25 = i15;
                    }
                    short s13 = (short) i18;
                    if (f4 >= 0.0f) {
                    }
                    long j8 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s13)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
                    int i37 = C9735l.smaato;
                    return j8;
                }
                if (i15 >= -10) {
                    i19 = (i14 | 8388608) >> (1 - i15);
                    if ((i19 & 4096) != 0) {
                        i19 += 8192;
                    }
                    i17 = i19 >> 13;
                } else {
                    i17 = 0;
                }
            }
        }
        i18 = i17 | (i12 << 15) | (i25 << 10);
        short s14 = (short) i18;
        if (f4 >= 0.0f) {
        }
        long j9 = (((long) i24) & 63) | ((((long) s8) & 65535) << 48) | ((((long) s12) & 65535) << 32) | ((65535 & ((long) s14)) << 16) | ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6);
        int i38 = C9735l.smaato;
        return j9;
    }
}
