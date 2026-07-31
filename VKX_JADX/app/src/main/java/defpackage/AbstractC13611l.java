package defpackage;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lْۘ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13611l {
    public static final C10557l yandex = new C10557l(18);
    public static final C14659l loadAd = new C14659l();
    public static final C12590l crashlytics = new C12590l(2);
    public static final C6157l amazon = new C6157l(1);

    public static final Bundle amazon(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        C8339l.metrica(AbstractC15560l.Signature("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    public static InterfaceC17242l billing(InterfaceC17242l interfaceC17242l, InterfaceC17955l interfaceC17955l, EnumC7283l enumC7283l, boolean z, boolean z2, C2403l c2403l) {
        return interfaceC17242l.premium(new C10983l(interfaceC17955l, enumC7283l, z, z2, c2403l));
    }

    public static InterfaceC5763l crashlytics(InterfaceC0273l interfaceC0273l, InterfaceC15446l interfaceC15446l) {
        InterfaceC5763l interfaceC5763l;
        if (!(interfaceC15446l instanceof C11583l)) {
            if (C6168l.f13001l == interfaceC15446l) {
                return interfaceC0273l;
            }
            return null;
        }
        C11583l c11583l = (C11583l) interfaceC15446l;
        InterfaceC15446l key = interfaceC0273l.getKey();
        if ((key == c11583l || c11583l.f23281l == key) && (interfaceC5763l = (InterfaceC5763l) c11583l.f23282l.invoke(interfaceC0273l)) != null) {
            return interfaceC5763l;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object loadAd(C4154l c4154l, long j, AbstractC0283l abstractC0283l) {
        C9411l c9411l;
        C13250l c13250l;
        C4154l c4154l2;
        if (abstractC0283l instanceof C9411l) {
            c9411l = (C9411l) abstractC0283l;
            int i = c9411l.f19253l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9411l.f19253l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9411l = new C9411l(abstractC0283l);
            }
        } else {
            c9411l = new C9411l(abstractC0283l);
        }
        Object obj = c9411l.f19256l;
        int i2 = c9411l.f19253l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c13250l = new C13250l();
            C11287l c11287l = new C11287l(c4154l, j, c13250l, (InterfaceC14029l) null, 5);
            c9411l.f19255l = c4154l;
            c9411l.f19254l = c13250l;
            c9411l.f19253l = 1;
            Object objMopub = c4154l.mopub(EnumC11011l.f22182l, c11287l, c9411l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objMopub == enumC9342l) {
                return enumC9342l;
            }
            c4154l2 = c4154l;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C13250l c13250l2 = c9411l.f19254l;
            C4154l c4154l3 = c9411l.f19255l;
            AbstractC2829l.crashlytics(obj);
            c13250l = c13250l2;
            c4154l2 = c4154l3;
        }
        return new C1187l(c4154l2.subs(c13250l.f26029l));
    }

    public static String mopub(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static InterfaceC12932l purchase(InterfaceC0273l interfaceC0273l, InterfaceC15446l interfaceC15446l) {
        if (interfaceC15446l instanceof C11583l) {
            C11583l c11583l = (C11583l) interfaceC15446l;
            InterfaceC15446l key = interfaceC0273l.getKey();
            if ((key != c11583l && c11583l.f23281l != key) || ((InterfaceC5763l) c11583l.f23282l.invoke(interfaceC0273l)) == null) {
                return interfaceC0273l;
            }
        } else if (C6168l.f13001l != interfaceC15446l) {
            return interfaceC0273l;
        }
        return C17218l.f33421l;
    }

    /* JADX WARN: Code duplicated, block: B:239:0x0351  */
    /* JADX WARN: Code duplicated, block: B:246:0x036d  */
    /* JADX WARN: Code duplicated, block: B:249:0x0385  */
    /* JADX WARN: Code duplicated, block: B:250:0x0387  */
    /* JADX WARN: Code duplicated, block: B:262:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:265:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:266:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:269:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:270:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:276:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:279:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:280:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:284:0x0405  */
    /* JADX WARN: Code duplicated, block: B:287:0x0414  */
    /* JADX WARN: Code duplicated, block: B:306:0x0454  */
    /* JADX WARN: Code duplicated, block: B:308:0x0469  */
    /* JADX WARN: Code duplicated, block: B:311:0x048c  */
    /* JADX WARN: Code duplicated, block: B:312:0x048e  */
    /* JADX WARN: Code duplicated, block: B:314:0x0491  */
    /* JADX WARN: Code duplicated, block: B:315:0x04a0  */
    public static final void yandex(InterfaceC17242l interfaceC17242l, AbstractC13264l abstractC13264l, final InterfaceC11780l interfaceC11780l, final EnumC7283l enumC7283l, C16290l c16290l, final boolean z, final C10306l c10306l, final float f, final InterfaceC2938l interfaceC2938l, InterfaceC12499l interfaceC12499l, final InterfaceC6947l interfaceC6947l, final C0086l c0086l, final InterfaceC0993l interfaceC0993l, final C15578l c15578l, C6956l c6956l, final int i, final int i2) {
        int i3;
        int i4;
        InterfaceC12499l interfaceC12499l2;
        C16290l c16290l2;
        InterfaceC17242l interfaceC17242l2;
        AbstractC13264l abstractC13264l2;
        boolean z2;
        boolean z3;
        boolean zBilling;
        Object c18581l;
        AbstractC13264l abstractC13264l3;
        C6956l c6956l2;
        int i5;
        EnumC7283l enumC7283l2;
        EnumC7283l enumC7283l3;
        boolean z4;
        boolean zMopub;
        Object objM2132native;
        boolean z5;
        boolean z6;
        boolean z7;
        Object objM2132native2;
        InterfaceC14447l interfaceC14447l;
        EnumC9931l enumC9931l;
        boolean z8;
        boolean zAmazon;
        Object objM2132native3;
        C4346l c4346l;
        InterfaceC17242l interfaceC17242lSubs;
        InterfaceC17242l interfaceC17242lPurchase;
        boolean z9;
        InterfaceC17242l interfaceC17242lPremium;
        boolean z10;
        Object objM2132native4;
        c6956l.m2133new(-572816025);
        if ((i & 6) == 0) {
            i3 = i | (c6956l.billing(interfaceC17242l) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c6956l.billing(abstractC13264l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c6956l.billing(interfaceC11780l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c6956l.mopub(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c6956l.amazon(enumC7283l.ordinal()) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= c6956l.billing(c16290l) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= c6956l.mopub(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c6956l.billing(c10306l) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= c6956l.amazon(0) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c6956l.crashlytics(f) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (c6956l.billing(interfaceC2938l) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c6956l.admob(interfaceC12499l) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c6956l.admob(null) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c6956l.billing(interfaceC6947l) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c6956l.billing(c0086l) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= c6956l.billing(interfaceC0993l) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= c6956l.admob(c15578l) ? 1048576 : 524288;
        }
        int i6 = i4;
        if (c6956l.m2127for(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & i6) == 599186) ? false : true)) {
            int i7 = i3 & 112;
            boolean z11 = i7 == 32;
            Object objM2132native5 = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (z11 || objM2132native5 == c13863l) {
                objM2132native5 = new C4838l(abstractC13264l, 0);
                c6956l.m2147try(objM2132native5);
            }
            Function0 function0 = (Function0) objM2132native5;
            int i8 = i3 >> 3;
            int i9 = i8 & 14;
            int i10 = i6 >> 15;
            int i11 = i9 | (i10 & 112) | (i6 & 896);
            InterfaceC8714l interfaceC8714lVip = AbstractC8020l.vip(c15578l, c6956l);
            InterfaceC8714l interfaceC8714lVip2 = AbstractC8020l.vip(null, c6956l);
            boolean zBilling2 = ((((i11 & 14) ^ 6) > 4 && c6956l.billing(abstractC13264l)) || (i11 & 6) == 4) | c6956l.billing(interfaceC8714lVip) | c6956l.billing(interfaceC8714lVip2) | c6956l.billing(function0);
            Object objM2132native6 = c6956l.m2132native();
            if (zBilling2 || objM2132native6 == c13863l) {
                C1461l c1461l = C1461l.f3659l;
                objM2132native6 = new C0059l(0, 5, InterfaceC12244l.class, AbstractC8020l.billing(c1461l, new C12242l(AbstractC8020l.billing(c1461l, new Cfinally(interfaceC8714lVip, interfaceC8714lVip2, function0, 17)), abstractC13264l, 27)), "value", "getValue()Ljava/lang/Object;");
                c6956l.m2147try(objM2132native6);
            }
            InterfaceC2901l interfaceC2901l = (InterfaceC2901l) objM2132native6;
            Object objM2132native7 = c6956l.m2132native();
            if (objM2132native7 == c13863l) {
                objM2132native7 = AbstractC12311l.isPro(c6956l);
                c6956l.m2147try(objM2132native7);
            }
            InterfaceC2262l interfaceC2262l = (InterfaceC2262l) objM2132native7;
            boolean z12 = i7 == 32;
            Object objM2132native8 = c6956l.m2132native();
            if (z12 || objM2132native8 == c13863l) {
                objM2132native8 = new C4838l(abstractC13264l, 1);
                c6956l.m2147try(objM2132native8);
            }
            Function0 function1 = (Function0) objM2132native8;
            int i12 = i3 >> 9;
            int i13 = (i3 & 65520) | (i12 & 458752) | (i12 & 3670016) | ((i6 << 21) & 29360128);
            int i14 = i6 << 15;
            int i15 = i13 | (i14 & 234881024) | (i14 & 1879048192);
            boolean zBilling3 = ((((i15 & 896) ^ 384) > 256 && c6956l.billing(interfaceC11780l)) || (i15 & 384) == 256) | ((((i15 & 112) ^ 48) > 32 && c6956l.billing(abstractC13264l)) || (i15 & 48) == 32) | ((((i15 & 7168) ^ 3072) > 2048 && c6956l.mopub(false)) || (i15 & 3072) == 2048) | ((((57344 & i15) ^ 24576) > 16384 && c6956l.amazon(enumC7283l.ordinal())) || (i15 & 24576) == 16384) | ((((i15 & 234881024) ^ 100663296) > 67108864 && c6956l.billing(interfaceC6947l)) || (i15 & 100663296) == 67108864) | ((((i15 & 1879048192) ^ 805306368) > 536870912 && c6956l.billing(c0086l)) || (i15 & 805306368) == 536870912) | ((((i15 & 3670016) ^ 1572864) > 1048576 && c6956l.crashlytics(f)) || (i15 & 1572864) == 1048576) | ((((i15 & 29360128) ^ 12582912) > 8388608 && c6956l.billing(interfaceC2938l)) || (i15 & 12582912) == 8388608) | ((((i10 & 14) ^ 6) > 4 && c6956l.billing(interfaceC0993l)) || (i10 & 6) == 4) | c6956l.billing(function1);
            if (((i15 & 458752) ^ 196608) > 131072) {
                z2 = false;
                if (c6956l.amazon(0)) {
                    z3 = true;
                }
                zBilling = z3 | zBilling3 | c6956l.billing(interfaceC2262l);
                Object objM2132native9 = c6956l.m2132native();
                if (!zBilling || objM2132native9 == c13863l) {
                    abstractC13264l3 = abstractC13264l;
                    c6956l2 = c6956l;
                    i5 = 4;
                    enumC7283l2 = enumC7283l;
                    c18581l = new C18581l(abstractC13264l3, enumC7283l2, interfaceC11780l, f, interfaceC2938l, interfaceC2901l, function1, c0086l, interfaceC6947l, interfaceC0993l, interfaceC2262l);
                    c6956l2.m2147try(c18581l);
                } else {
                    c6956l2 = c6956l;
                    c18581l = objM2132native9;
                    i5 = 4;
                    abstractC13264l3 = abstractC13264l;
                    enumC7283l2 = enumC7283l;
                }
                InterfaceC2948l interfaceC2948l = (InterfaceC2948l) c18581l;
                enumC7283l3 = EnumC7283l.f15126l;
                if (enumC7283l2 == enumC7283l3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zMopub = (((i9 ^ 6) <= i5 && c6956l2.billing(abstractC13264l3)) || (i8 & 6) == i5) | c6956l2.mopub(z4);
                objM2132native = c6956l2.m2132native();
                if (zMopub || objM2132native == c13863l) {
                    objM2132native = new C6133l(abstractC13264l3, z4);
                    c6956l2.m2147try(objM2132native);
                }
                InterfaceC14371l interfaceC14371l = (InterfaceC14371l) objM2132native;
                if (i7 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((i3 & 458752) == 131072) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z6 | z5;
                objM2132native2 = c6956l2.m2132native();
                if (!z7 || objM2132native2 == c13863l) {
                    c16290l2 = c16290l;
                    objM2132native2 = new C8221l(c16290l2, abstractC13264l3);
                    c6956l2.m2147try(objM2132native2);
                } else {
                    c16290l2 = c16290l;
                }
                C8221l c8221l = (C8221l) objM2132native2;
                interfaceC14447l = (InterfaceC14447l) c6956l2.isPro(AbstractC10872l.yandex);
                enumC9931l = (EnumC9931l) c6956l2.isPro(AbstractC4751l.vip);
                if (i7 == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                zAmazon = c6956l2.amazon(enumC9931l.ordinal()) | z8 | c6956l2.billing(interfaceC14447l);
                objM2132native3 = c6956l2.m2132native();
                if (zAmazon || objM2132native3 == c13863l) {
                    objM2132native3 = new C12849l(abstractC13264l3, interfaceC14447l, enumC9931l);
                    c6956l2.m2147try(objM2132native3);
                }
                C12849l c12849l = (C12849l) objM2132native3;
                c4346l = C4346l.f8873l;
                if (z) {
                    c6956l2.m2123default(-853734429);
                    int i16 = i9 | ((i3 >> 21) & 112);
                    z10 = ((((i16 & 112) ^ 48) <= 32 && c6956l2.amazon(0)) || (i16 & 48) == 32) | ((((i16 & 14) ^ 6) <= i5 && c6956l2.billing(abstractC13264l3)) || (i16 & 6) == i5);
                    objM2132native4 = c6956l2.m2132native();
                    if (z10 || objM2132native4 == c13863l) {
                        objM2132native4 = new C16639l(abstractC13264l3);
                        c6956l2.m2147try(objM2132native4);
                    }
                    interfaceC17242lSubs = AbstractC10565l.subs((C16639l) objM2132native4, abstractC13264l3.license, enumC7283l2);
                    c6956l2.startapp(false);
                } else {
                    c6956l2.m2123default(-853304645);
                    c6956l2.startapp(false);
                    interfaceC17242lSubs = c4346l;
                }
                interfaceC17242l2 = interfaceC17242l;
                interfaceC17242lPurchase = AbstractC2648l.purchase(interfaceC17242l2.premium(abstractC13264l3.advert).premium(abstractC13264l3.pro), interfaceC2901l, interfaceC14371l, enumC7283l2, z);
                if (enumC7283l2 == enumC7283l3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z) {
                    interfaceC17242lPremium = interfaceC17242lPurchase.premium(AbstractC4962l.yandex(c4346l, false, new C3533l(z9, abstractC13264l3, interfaceC2262l, 0)));
                } else {
                    interfaceC17242lPremium = interfaceC17242lPurchase.premium(c4346l);
                }
                abstractC13264l2 = abstractC13264l3;
                interfaceC12499l2 = interfaceC12499l;
                AbstractC18377l.yandex(interfaceC2901l, AbstractC16422l.mopub(AbstractC18377l.amazon(interfaceC17242lPremium.premium(interfaceC17242lSubs), abstractC13264l3, enumC7283l2, c10306l, z, c8221l, abstractC13264l3.startapp, c12849l).premium(new C8110l(abstractC13264l3, null, null, new C7795l(1, abstractC13264l3), 6)), interfaceC12499l2, null), abstractC13264l2.tapsense, interfaceC2948l, c6956l2, 0);
            } else {
                z2 = false;
            }
            if ((i15 & 196608) == 131072) {
                z3 = true;
            } else {
                z3 = z2;
            }
            zBilling = z3 | zBilling3 | c6956l.billing(interfaceC2262l);
            Object objM2132native10 = c6956l.m2132native();
            if (zBilling) {
                abstractC13264l3 = abstractC13264l;
                c6956l2 = c6956l;
                i5 = 4;
                enumC7283l2 = enumC7283l;
                c18581l = new C18581l(abstractC13264l3, enumC7283l2, interfaceC11780l, f, interfaceC2938l, interfaceC2901l, function1, c0086l, interfaceC6947l, interfaceC0993l, interfaceC2262l);
                c6956l2.m2147try(c18581l);
            } else {
                abstractC13264l3 = abstractC13264l;
                c6956l2 = c6956l;
                i5 = 4;
                enumC7283l2 = enumC7283l;
                c18581l = new C18581l(abstractC13264l3, enumC7283l2, interfaceC11780l, f, interfaceC2938l, interfaceC2901l, function1, c0086l, interfaceC6947l, interfaceC0993l, interfaceC2262l);
                c6956l2.m2147try(c18581l);
            }
            InterfaceC2948l interfaceC2948l2 = (InterfaceC2948l) c18581l;
            enumC7283l3 = EnumC7283l.f15126l;
            if (enumC7283l2 == enumC7283l3) {
                z4 = true;
            } else {
                z4 = false;
            }
            zMopub = (((i9 ^ 6) <= i5 && c6956l2.billing(abstractC13264l3)) || (i8 & 6) == i5) | c6956l2.mopub(z4);
            objM2132native = c6956l2.m2132native();
            if (zMopub) {
                objM2132native = new C6133l(abstractC13264l3, z4);
                c6956l2.m2147try(objM2132native);
            } else {
                objM2132native = new C6133l(abstractC13264l3, z4);
                c6956l2.m2147try(objM2132native);
            }
            InterfaceC14371l interfaceC14371l2 = (InterfaceC14371l) objM2132native;
            if (i7 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i3 & 458752) == 131072) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = z6 | z5;
            objM2132native2 = c6956l2.m2132native();
            if (z7) {
                c16290l2 = c16290l;
                objM2132native2 = new C8221l(c16290l2, abstractC13264l3);
                c6956l2.m2147try(objM2132native2);
            } else {
                c16290l2 = c16290l;
                objM2132native2 = new C8221l(c16290l2, abstractC13264l3);
                c6956l2.m2147try(objM2132native2);
            }
            C8221l c8221l2 = (C8221l) objM2132native2;
            interfaceC14447l = (InterfaceC14447l) c6956l2.isPro(AbstractC10872l.yandex);
            enumC9931l = (EnumC9931l) c6956l2.isPro(AbstractC4751l.vip);
            if (i7 == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            zAmazon = c6956l2.amazon(enumC9931l.ordinal()) | z8 | c6956l2.billing(interfaceC14447l);
            objM2132native3 = c6956l2.m2132native();
            if (zAmazon) {
                objM2132native3 = new C12849l(abstractC13264l3, interfaceC14447l, enumC9931l);
                c6956l2.m2147try(objM2132native3);
            } else {
                objM2132native3 = new C12849l(abstractC13264l3, interfaceC14447l, enumC9931l);
                c6956l2.m2147try(objM2132native3);
            }
            C12849l c12849l2 = (C12849l) objM2132native3;
            c4346l = C4346l.f8873l;
            if (z) {
                c6956l2.m2123default(-853734429);
                int i17 = i9 | ((i3 >> 21) & 112);
                if (((i17 & 14) ^ 6) <= i5) {
                }
                z10 = ((((i17 & 112) ^ 48) <= 32 && c6956l2.amazon(0)) || (i17 & 48) == 32) | ((((i17 & 14) ^ 6) <= i5 && c6956l2.billing(abstractC13264l3)) || (i17 & 6) == i5);
                objM2132native4 = c6956l2.m2132native();
                if (z10) {
                    objM2132native4 = new C16639l(abstractC13264l3);
                    c6956l2.m2147try(objM2132native4);
                } else {
                    objM2132native4 = new C16639l(abstractC13264l3);
                    c6956l2.m2147try(objM2132native4);
                }
                interfaceC17242lSubs = AbstractC10565l.subs((C16639l) objM2132native4, abstractC13264l3.license, enumC7283l2);
                c6956l2.startapp(false);
            } else {
                c6956l2.m2123default(-853304645);
                c6956l2.startapp(false);
                interfaceC17242lSubs = c4346l;
            }
            interfaceC17242l2 = interfaceC17242l;
            interfaceC17242lPurchase = AbstractC2648l.purchase(interfaceC17242l2.premium(abstractC13264l3.advert).premium(abstractC13264l3.pro), interfaceC2901l, interfaceC14371l2, enumC7283l2, z);
            if (enumC7283l2 == enumC7283l3) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z) {
                interfaceC17242lPremium = interfaceC17242lPurchase.premium(AbstractC4962l.yandex(c4346l, false, new C3533l(z9, abstractC13264l3, interfaceC2262l, 0)));
            } else {
                interfaceC17242lPremium = interfaceC17242lPurchase.premium(c4346l);
            }
            abstractC13264l2 = abstractC13264l3;
            interfaceC12499l2 = interfaceC12499l;
            AbstractC18377l.yandex(interfaceC2901l, AbstractC16422l.mopub(AbstractC18377l.amazon(interfaceC17242lPremium.premium(interfaceC17242lSubs), abstractC13264l3, enumC7283l2, c10306l, z, c8221l2, abstractC13264l3.startapp, c12849l2).premium(new C8110l(abstractC13264l3, null, null, new C7795l(1, abstractC13264l3), 6)), interfaceC12499l2, null), abstractC13264l2.tapsense, interfaceC2948l2, c6956l2, 0);
        } else {
            interfaceC12499l2 = interfaceC12499l;
            c16290l2 = c16290l;
            interfaceC17242l2 = interfaceC17242l;
            abstractC13264l2 = abstractC13264l;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            final AbstractC13264l abstractC13264l4 = abstractC13264l2;
            final C16290l c16290l3 = c16290l2;
            final InterfaceC17242l interfaceC17242l3 = interfaceC17242l2;
            final InterfaceC12499l interfaceC12499l3 = interfaceC12499l2;
            c4224lAds.amazon = new Function2() { // from class: lُۣٞ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iPurchase = AbstractC0545l.purchase(i | 1);
                    int iPurchase2 = AbstractC0545l.purchase(i2);
                    AbstractC13611l.yandex(interfaceC17242l3, abstractC13264l4, interfaceC11780l, enumC7283l, c16290l3, z, c10306l, f, interfaceC2938l, interfaceC12499l3, interfaceC6947l, c0086l, interfaceC0993l, c15578l, (C6956l) obj, iPurchase, iPurchase2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
