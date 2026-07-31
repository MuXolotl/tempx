package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: lَٕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10310l {
    public static final C15578l yandex = new C15578l(2050145068, false, new C11902l(28));
    public static final C15578l loadAd = new C15578l(-1826085175, false, new C11902l(29));
    public static final C15578l crashlytics = new C15578l(1981716426, false, new C10673l(16));
    public static final C15578l amazon = new C15578l(-705657878, false, new C17304l(0));
    public static final C15578l purchase = new C15578l(2092249326, false, new C17304l(1));
    public static final C15578l billing = new C15578l(-1394519925, false, new C17304l(2));
    public static final C15578l mopub = new C15578l(-2113565906, false, new C17304l(3));
    public static final C15578l admob = new C15578l(1174440974, false, new C17304l(4));
    public static final C15578l subs = new C15578l(-1250285271, false, new C17304l(5));

    public static TypedArray Signature(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object ad(InterfaceC9354l interfaceC9354l, AbstractC0283l abstractC0283l) throws EOFException {
        C10941l c10941l;
        InterfaceC14189l interfaceC14189lMopub;
        InterfaceC14189l interfaceC14189l;
        if (abstractC0283l instanceof C10941l) {
            c10941l = (C10941l) abstractC0283l;
            int i = c10941l.f22070l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10941l.f22070l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10941l = new C10941l(abstractC0283l);
            }
        } else {
            c10941l = new C10941l(abstractC0283l);
        }
        Object obj = c10941l.f22068l;
        int i2 = c10941l.f22070l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            interfaceC14189lMopub = interfaceC9354l.mopub();
            if (interfaceC14189lMopub.subs()) {
                c10941l.f22069l = interfaceC14189lMopub;
                c10941l.f22070l = 1;
                int i3 = AbstractC3458l.yandex;
                Object objAmazon = interfaceC9354l.amazon(1, c10941l);
                Object obj2 = EnumC9342l.f19165l;
                if (objAmazon == obj2) {
                    return obj2;
                }
                obj = objAmazon;
                interfaceC14189l = interfaceC14189lMopub;
            }
            return Byte.valueOf(interfaceC14189lMopub.readByte());
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC14189l = c10941l.f22069l;
        AbstractC2829l.crashlytics(obj);
        if (!((Boolean) obj).booleanValue()) {
            throw new EOFException("Not enough data available");
        }
        interfaceC14189lMopub = interfaceC14189l;
        return Byte.valueOf(interfaceC14189lMopub.readByte());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:105:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:107:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:110:0x0316  */
    /* JADX WARN: Code duplicated, block: B:113:0x0323  */
    /* JADX WARN: Code duplicated, block: B:114:0x0328  */
    /* JADX WARN: Code duplicated, block: B:116:0x0338  */
    /* JADX WARN: Code duplicated, block: B:119:0x034b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0358  */
    /* JADX WARN: Code duplicated, block: B:123:0x035c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0375  */
    /* JADX WARN: Code duplicated, block: B:129:0x037e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0386  */
    /* JADX WARN: Code duplicated, block: B:134:0x0393  */
    /* JADX WARN: Code duplicated, block: B:136:0x039b  */
    /* JADX WARN: Code duplicated, block: B:138:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:140:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:142:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x013c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0225  */
    /* JADX WARN: Code duplicated, block: B:75:0x022d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0261  */
    /* JADX WARN: Code duplicated, block: B:88:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:90:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:92:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:96:0x02d1  */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02b0, code lost:
    
        r12 = r24;
        r6 = r7;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0109, code lost:
    
        if (r32.amazon(1, r2) == r12) goto L125;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:142:0x03b1, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0295 -> B:86:0x029e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object adcel(defpackage.InterfaceC9354l r32, defpackage.C16231l r33, long r34, boolean r36, boolean r37, defpackage.AbstractC0283l r38) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 984
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10310l.adcel(lٍؘؒ, lؙٖۚ, long, boolean, boolean, lّؑۧ):java.lang.Object");
    }

    public static InterfaceC6211l admob(C15026l c15026l) {
        if (c15026l == C15026l.mopub) {
            return new C13645l(new C10828l("HmacSha256", 2));
        }
        if (c15026l == C15026l.amazon) {
            return C2494l.m1156l(EnumC1618l.f3954l);
        }
        if (c15026l == C15026l.purchase) {
            return C2494l.m1156l(EnumC1618l.f3953l);
        }
        if (c15026l == C15026l.billing) {
            return C2494l.m1156l(EnumC1618l.f3952l);
        }
        C8339l.metrica("Unrecognized HPKE KEM identifier");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[PHI: r9 r11
  0x0059: PHI (r9v4 lٖٓۡ) = (r9v0 lٖٓۡ), (r9v6 lٖٓۡ) binds: [B:15:0x003f, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]
  0x0059: PHI (r11v2 boolean) = (r11v0 boolean), (r11v3 boolean) binds: [B:15:0x003f, B:20:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object ads(InterfaceC14189l interfaceC14189l, InterfaceC9354l interfaceC9354l, boolean z, AbstractC0283l abstractC0283l) {
        C4697l c4697l;
        if (abstractC0283l instanceof C4697l) {
            c4697l = (C4697l) abstractC0283l;
            int i = c4697l.f9540l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c4697l.f9540l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c4697l = new C4697l(abstractC0283l);
            }
        } else {
            c4697l = new C4697l(abstractC0283l);
        }
        Object objAmazon = c4697l.f9543l;
        int i2 = c4697l.f9540l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objAmazon);
            if (interfaceC14189l.crashlytics().f36079l < 2) {
                c4697l.f9542l = interfaceC14189l;
                c4697l.f9541l = z;
                c4697l.f9540l = 1;
                objAmazon = interfaceC9354l.amazon(2, c4697l);
                Object obj = EnumC9342l.f19165l;
                if (objAmazon == obj) {
                    return obj;
                }
            } else if (interfaceC14189l.crashlytics().yandex(1L) == 10) {
                AbstractC15639l.loadAd(interfaceC14189l, 2L);
                return Boolean.TRUE;
            }
            if (z) {
                return Boolean.FALSE;
            }
            AbstractC15639l.loadAd(interfaceC14189l, 1L);
            return Boolean.TRUE;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = c4697l.f9541l;
        interfaceC14189l = c4697l.f9542l;
        AbstractC2829l.crashlytics(objAmazon);
        if (((Boolean) objAmazon).booleanValue()) {
            if (interfaceC14189l.crashlytics().yandex(1L) == 10) {
                AbstractC15639l.loadAd(interfaceC14189l, 2L);
                return Boolean.TRUE;
            }
        }
        if (z) {
            return Boolean.FALSE;
        }
        AbstractC15639l.loadAd(interfaceC14189l, 1L);
        return Boolean.TRUE;
    }

    public static Object advert(InterfaceC9354l interfaceC9354l, C16231l c16231l, AbstractC0283l abstractC0283l) {
        return adcel(interfaceC9354l, c16231l, 8192L, false, true, abstractC0283l);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        if (r1.amazon(r6, r13) == r8) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
    
        if (r0 == r8) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [lٌؚۛ] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [lٌؚۛ] */
    /* JADX WARN: Type inference failed for: r2v5, types: [lٌؚۛ] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00cc -> B:20:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object amazon(defpackage.InterfaceC9354l r17, defpackage.InterfaceC8639l r18, long r19, defpackage.AbstractC0283l r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10310l.amazon(lٍؘؒ, lٌؚۛ, long, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object applovin(InterfaceC9354l interfaceC9354l, AbstractC0283l abstractC0283l) throws EOFException {
        C14989l c14989l;
        if (abstractC0283l instanceof C14989l) {
            c14989l = (C14989l) abstractC0283l;
            int i = c14989l.f29500l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14989l.f29500l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14989l = new C14989l(abstractC0283l);
            }
        } else {
            c14989l = new C14989l(abstractC0283l);
        }
        Object obj = c14989l.f29498l;
        int i2 = c14989l.f29500l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c14989l.f29499l = interfaceC9354l;
            c14989l.f29500l = 1;
            Object objLoadAd = loadAd(interfaceC9354l, 2, c14989l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC9354l = c14989l.f29499l;
            AbstractC2829l.crashlytics(obj);
        }
        return new Short(interfaceC9354l.mopub().readShort());
    }

    public static final C12034l appmetrica(InterfaceC2262l interfaceC2262l, InterfaceC12932l interfaceC12932l, C4993l c4993l, Function2 function2) {
        InterfaceC14029l interfaceC14029l = null;
        int i = 0;
        C7504l c7504lMopub = AbstractC10999l.mopub(interfaceC2262l, interfaceC12932l, 0, new C3678l(function2, c4993l, interfaceC14029l, i), 2);
        c7504lMopub.mo2154l(new C6383l(c4993l, 1));
        return new C12034l(new C8218l(c4993l, new C13954l(c7504lMopub, interfaceC14029l, i)), c7504lMopub);
    }

    public static InterfaceC3881l billing(C2204l c2204l) {
        if (c2204l == C2204l.amazon) {
            return new C14513l(16);
        }
        if (c2204l == C2204l.purchase) {
            return new C14513l(32);
        }
        if (c2204l == C2204l.billing) {
            return new C1461l(26);
        }
        C8339l.metrica("Unrecognized HPKE AEAD identifier");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006b A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #2 {all -> 0x009c, blocks: (B:27:0x0065, B:29:0x006b, B:38:0x00a2, B:46:0x00be), top: B:59:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2 A[Catch: all -> 0x009c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x009c, blocks: (B:27:0x0065, B:29:0x006b, B:38:0x00a2, B:46:0x00be), top: B:59:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00be A[Catch: all -> 0x009c, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x009c, blocks: (B:27:0x0065, B:29:0x006b, B:38:0x00a2, B:46:0x00be), top: B:59:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r0 == r8) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [lٍؘؒ] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [lٌؚۛ] */
    /* JADX WARN: Type inference failed for: r14v5, types: [lٌؚۛ] */
    /* JADX WARN: Type inference failed for: r14v6, types: [lٍؘؒ] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [lٌؚۛ] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [lٍؘؒ] */
    /* JADX WARN: Type inference failed for: r2v4, types: [lٍؘؒ] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0099 -> B:20:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object crashlytics(defpackage.InterfaceC9354l r14, defpackage.C4993l r15, defpackage.AbstractC0283l r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10310l.crashlytics(lٍؘؒ, lؗٚۥ, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object firebase(InterfaceC9354l interfaceC9354l, AbstractC0283l abstractC0283l) {
        C11811l c11811l;
        if (abstractC0283l instanceof C11811l) {
            c11811l = (C11811l) abstractC0283l;
            int i = c11811l.f23636l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11811l.f23636l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11811l = new C11811l(abstractC0283l);
            }
        } else {
            c11811l = new C11811l(abstractC0283l);
        }
        Object obj = c11811l.f23634l;
        int i2 = c11811l.f23636l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (interfaceC9354l.mopub().subs()) {
                c11811l.f23635l = interfaceC9354l;
                c11811l.f23636l = 1;
                int i3 = AbstractC3458l.yandex;
                Object objAmazon = interfaceC9354l.amazon(1, c11811l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objAmazon == enumC9342l) {
                    return enumC9342l;
                }
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC9354l = c11811l.f23635l;
            AbstractC2829l.crashlytics(obj);
        }
        return Boolean.valueOf(interfaceC9354l.mopub().subs());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (subs(r6, r7, r0) == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object inmobi(defpackage.InterfaceC9354l r6, defpackage.C4074l r7, defpackage.AbstractC0283l r8) {
        /*
            boolean r0 = r8 instanceof defpackage.C15997l
            if (r0 == 0) goto L13
            r0 = r8
            lٕۡۥ r0 = (defpackage.C15997l) r0
            int r1 = r0.f31374l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31374l = r1
            goto L18
        L13:
            lٕۡۥ r0 = new lٕۡۥ
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f31377l
            int r1 = r0.f31374l
            r2 = 0
            r3 = 2
            r4 = 1
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L63
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r2
        L31:
            lّؖ۠ r7 = r0.f31375l
            lٍؘؒ r6 = r0.f31376l
            defpackage.AbstractC2829l.crashlytics(r8)
            goto L4c
        L39:
            defpackage.AbstractC2829l.crashlytics(r8)
            byte[] r8 = r7.f8376l
            int r8 = r8.length
            r0.f31376l = r6
            r0.f31375l = r7
            r0.f31374l = r4
            java.lang.Comparable r8 = license(r6, r8, r0)
            if (r8 != r5) goto L4c
            goto L62
        L4c:
            boolean r8 = defpackage.AbstractC8576l.yandex(r8, r7)
            if (r8 == 0) goto L66
            byte[] r7 = r7.f8376l
            int r7 = r7.length
            long r7 = (long) r7
            r0.f31376l = r2
            r0.f31375l = r2
            r0.f31374l = r3
            java.lang.Object r6 = subs(r6, r7, r0)
            if (r6 != r5) goto L63
        L62:
            return r5
        L63:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L66:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10310l.inmobi(lٍؘؒ, lّؖ۠, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object isPro(InterfaceC9354l interfaceC9354l, long j, AbstractC0283l abstractC0283l) throws EOFException {
        C8373l c8373l;
        if (abstractC0283l instanceof C8373l) {
            c8373l = (C8373l) abstractC0283l;
            int i = c8373l.f17334l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8373l.f17334l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8373l = new C8373l(abstractC0283l);
            }
        } else {
            c8373l = new C8373l(abstractC0283l);
        }
        Object objSubs = c8373l.f17332l;
        int i2 = c8373l.f17334l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objSubs);
            c8373l.f17333l = j;
            c8373l.f17334l = 1;
            objSubs = subs(interfaceC9354l, j, c8373l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objSubs == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = c8373l.f17333l;
            AbstractC2829l.crashlytics(objSubs);
        }
        if (((Number) objSubs).longValue() >= j) {
            return Unit.INSTANCE;
        }
        throw new EOFException(AbstractC2812l.subscription(j, "Unable to discard ", " bytes"));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065 A[PHI: r10 r11 r12
  0x0065: PHI (r10v5 lٍؘؒ) = (r10v3 lٍؘؒ), (r10v7 lٍؘؒ) binds: [B:18:0x004c, B:23:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r11v6 lّٞ) = (r11v5 lّٞ), (r11v7 lّٞ) binds: [B:18:0x004c, B:23:0x0063] A[DONT_GENERATE, DONT_INLINE]
  0x0065: PHI (r12v7 int) = (r12v6 int), (r12v8 int) binds: [B:18:0x004c, B:23:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004c -> B:24:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0061 -> B:23:0x0063). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object isVip(defpackage.InterfaceC9354l r10, int r11, defpackage.AbstractC0283l r12) {
        /*
            boolean r0 = r12 instanceof defpackage.C15136l
            if (r0 == 0) goto L13
            r0 = r12
            lٟٔۙ r0 = (defpackage.C15136l) r0
            int r1 = r0.f29686l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29686l = r1
            goto L18
        L13:
            lٟٔۙ r0 = new lٟٔۙ
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f29685l
            int r1 = r0.f29686l
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            int r10 = r0.f29689l
            lّٞ r11 = r0.f29687l
            lٍؘؒ r1 = r0.f29688l
            defpackage.AbstractC2829l.crashlytics(r12)
            goto L63
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r10)
            r10 = 0
            return r10
        L32:
            defpackage.AbstractC2829l.crashlytics(r12)
            lّٞ r12 = new lّٞ
            r12.<init>()
            r9 = r12
            r12 = r11
            r11 = r9
        L3d:
            long r3 = r11.f36079l
            long r5 = (long) r12
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L91
            lّٞ r1 = r10.mopub()
            boolean r1 = r1.subs()
            if (r1 == 0) goto L65
            r0.f29688l = r10
            r0.f29687l = r11
            r0.f29689l = r12
            r0.f29686l = r2
            int r1 = defpackage.AbstractC3458l.yandex
            java.lang.Object r1 = r10.amazon(r2, r0)
            lٍؗؐ r3 = defpackage.EnumC9342l.f19165l
            if (r1 != r3) goto L61
            return r3
        L61:
            r1 = r10
            r10 = r12
        L63:
            r12 = r10
            r10 = r1
        L65:
            boolean r1 = r10.admob()
            if (r1 != 0) goto L91
            lّٞ r1 = r10.mopub()
            long r3 = r1.f36079l
            long r5 = (long) r12
            long r7 = r11.f36079l
            long r7 = r5 - r7
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L85
            lّٞ r1 = r10.mopub()
            long r3 = r11.f36079l
            long r5 = r5 - r3
            r1.mopub(r11, r5)
            goto L3d
        L85:
            lّٞ r1 = r10.mopub()
            long r3 = r1.signatures(r11)
            defpackage.AbstractC15300l.crashlytics(r3)
            goto L3d
        L91:
            long r0 = r11.f36079l
            long r2 = (long) r12
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 < 0) goto L99
            return r11
        L99:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r0 = "Not enough data available, required "
            java.lang.String r1 = " bytes but only "
            java.lang.StringBuilder r12 = defpackage.AbstractC2812l.Signature(r0, r12, r1)
            long r0 = r11.f36079l
            java.lang.String r11 = " available"
            java.lang.String r11 = defpackage.AbstractC15560l.ads(r0, r11, r12)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10310l.isVip(lٍؘؒ, int, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Comparable license(InterfaceC9354l interfaceC9354l, int i, AbstractC0283l abstractC0283l) {
        C2574l c2574l;
        if (abstractC0283l instanceof C2574l) {
            c2574l = (C2574l) abstractC0283l;
            int i2 = c2574l.f5604l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2574l.f5604l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2574l = new C2574l(abstractC0283l);
            }
        } else {
            c2574l = new C2574l(abstractC0283l);
        }
        Object objAmazon = c2574l.f5607l;
        int i3 = c2574l.f5604l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(objAmazon);
            if (!interfaceC9354l.admob()) {
                c2574l.f5606l = interfaceC9354l;
                c2574l.f5605l = i;
                c2574l.f5604l = 1;
                objAmazon = interfaceC9354l.amazon(i, c2574l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objAmazon == enumC9342l) {
                    return enumC9342l;
                }
            }
            return null;
        }
        if (i3 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = c2574l.f5605l;
        interfaceC9354l = c2574l.f5606l;
        AbstractC2829l.crashlytics(objAmazon);
        if (((Boolean) objAmazon).booleanValue()) {
            C18476l c18476lMopub = interfaceC9354l.mopub();
            c18476lMopub.getClass();
            return new C4074l(AbstractC10733l.admob(new C3972l(new C1849l(c18476lMopub)), i));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object loadAd(InterfaceC9354l interfaceC9354l, int i, AbstractC0283l abstractC0283l) throws EOFException {
        C5423l c5423l;
        if (abstractC0283l instanceof C5423l) {
            c5423l = (C5423l) abstractC0283l;
            int i2 = c5423l.f11621l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5423l.f11621l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5423l = new C5423l(abstractC0283l);
            }
        } else {
            c5423l = new C5423l(abstractC0283l);
        }
        Object objAmazon = c5423l.f11622l;
        int i3 = c5423l.f11621l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(objAmazon);
            c5423l.f11621l = 1;
            objAmazon = interfaceC9354l.amazon(i, c5423l);
            Object obj = EnumC9342l.f19165l;
            if (objAmazon == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objAmazon);
        }
        if (((Boolean) objAmazon).booleanValue()) {
            return Unit.INSTANCE;
        }
        throw new EOFException("Not enough data available");
    }

    public static String metrica(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (startapp(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static C10828l mopub(C6636l c6636l) {
        int i = 2;
        if (c6636l == C6636l.amazon) {
            return new C10828l("HmacSha256", i);
        }
        if (c6636l == C6636l.purchase) {
            return new C10828l("HmacSha384", i);
        }
        if (c6636l == C6636l.billing) {
            return new C10828l("HmacSha512", i);
        }
        C8339l.metrica("Unrecognized HPKE KDF identifier");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object premium(InterfaceC9354l interfaceC9354l, AbstractC0283l abstractC0283l) throws Throwable {
        C3196l c3196l;
        C18476l c18476l;
        if (abstractC0283l instanceof C3196l) {
            c3196l = (C3196l) abstractC0283l;
            int i = c3196l.f6859l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3196l.f6859l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c3196l = new C3196l(abstractC0283l);
            }
        } else {
            c3196l = new C3196l(abstractC0283l);
        }
        Object obj = c3196l.f6862l;
        int i2 = c3196l.f6859l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c18476l = new C18476l();
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C18476l c18476l2 = c3196l.f6860l;
            InterfaceC9354l interfaceC9354l2 = c3196l.f6861l;
            AbstractC2829l.crashlytics(obj);
            c18476l = c18476l2;
            interfaceC9354l = interfaceC9354l2;
        }
        while (!interfaceC9354l.admob()) {
            c18476l.isVip(interfaceC9354l.mopub());
            c3196l.f6861l = interfaceC9354l;
            c3196l.f6860l = c18476l;
            c3196l.f6859l = 1;
            int i3 = AbstractC3458l.yandex;
            Object objAmazon = interfaceC9354l.amazon(1, c3196l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAmazon == enumC9342l) {
                return enumC9342l;
            }
        }
        Throwable thLoadAd = interfaceC9354l.loadAd();
        if (thLoadAd != null) {
            throw thLoadAd;
        }
        c18476l.crashlytics();
        return c18476l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object pro(InterfaceC9354l interfaceC9354l, AbstractC0283l abstractC0283l) throws Throwable {
        C15530l c15530l;
        C18476l c18476l;
        if (abstractC0283l instanceof C15530l) {
            c15530l = (C15530l) abstractC0283l;
            int i = c15530l.f30338l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15530l.f30338l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15530l = new C15530l(abstractC0283l);
            }
        } else {
            c15530l = new C15530l(abstractC0283l);
        }
        Object obj = c15530l.f30341l;
        int i2 = c15530l.f30338l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c18476l = new C18476l();
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C18476l c18476l2 = c15530l.f30339l;
            InterfaceC9354l interfaceC9354l2 = c15530l.f30340l;
            AbstractC2829l.crashlytics(obj);
            c18476l = c18476l2;
            interfaceC9354l = interfaceC9354l2;
        }
        while (!interfaceC9354l.admob()) {
            c18476l.isVip(interfaceC9354l.mopub());
            c15530l.f30340l = interfaceC9354l;
            c15530l.f30339l = c18476l;
            c15530l.f30338l = 1;
            int i3 = AbstractC3458l.yandex;
            Object objAmazon = interfaceC9354l.amazon(1, c15530l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAmazon == enumC9342l) {
                return enumC9342l;
            }
        }
        Throwable thLoadAd = interfaceC9354l.loadAd();
        if (thLoadAd == null) {
            return c18476l;
        }
        throw thLoadAd;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006f A[Catch: all -> 0x00a0, TRY_LEAVE, TryCatch #0 {all -> 0x00a0, blocks: (B:27:0x0069, B:29:0x006f), top: B:52:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (r11.amazon(1, r1) == r8) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [lٌؚۛ] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [lٌؚۛ] */
    /* JADX WARN: Type inference failed for: r2v5, types: [lٌؚۛ] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009d -> B:20:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object purchase(defpackage.InterfaceC9354l r16, defpackage.InterfaceC8639l r17, defpackage.AbstractC0283l r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10310l.purchase(lٍؘؒ, lٌؚۛ, lّؑۧ):java.lang.Object");
    }

    public static ColorStateList remoteconfig(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (startapp(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(1, typedValue);
            int i = typedValue.type;
            if (i != 2) {
                if (i >= 28 && i <= 31) {
                    return ColorStateList.valueOf(typedValue.data);
                }
                Resources resources = typedArray.getResources();
                int resourceId = typedArray.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC3053l.yandex;
                try {
                    return AbstractC3053l.yandex(resources, resources.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                    return null;
                }
            }
            C1759l.adcel(typedValue, "Failed to resolve attribute at index 1: ");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object signatures(InterfaceC9354l interfaceC9354l, long j, AbstractC0283l abstractC0283l) {
        C15612l c15612l;
        C18476l c18476l;
        long j2;
        if (abstractC0283l instanceof C15612l) {
            c15612l = (C15612l) abstractC0283l;
            int i = c15612l.f30474l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15612l.f30474l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15612l = new C15612l(abstractC0283l);
            }
        } else {
            c15612l = new C15612l(abstractC0283l);
        }
        Object obj = c15612l.f30471l;
        int i2 = c15612l.f30474l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c18476l = new C18476l();
            j2 = j;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = c15612l.f30470l;
            long j4 = c15612l.f30475l;
            C18476l c18476l2 = c15612l.f30472l;
            InterfaceC9354l interfaceC9354l2 = c15612l.f30473l;
            AbstractC2829l.crashlytics(obj);
            c18476l = c18476l2;
            j = j3;
            interfaceC9354l = interfaceC9354l2;
            j2 = j4;
        }
        while (!interfaceC9354l.admob()) {
            long j5 = 0;
            if (j <= 0) {
                break;
            }
            if (j >= interfaceC9354l.mopub().f36079l) {
                j5 = j - interfaceC9354l.mopub().f36079l;
                AbstractC15300l.crashlytics(interfaceC9354l.mopub().signatures(c18476l));
            } else {
                interfaceC9354l.mopub().mopub(c18476l, j);
            }
            c15612l.f30473l = interfaceC9354l;
            c15612l.f30472l = c18476l;
            c15612l.f30475l = j2;
            c15612l.f30470l = j5;
            c15612l.f30474l = 1;
            int i3 = AbstractC3458l.yandex;
            Object objAmazon = interfaceC9354l.amazon(1, c15612l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objAmazon == enumC9342l) {
                return enumC9342l;
            }
            j = j5;
        }
        c18476l.crashlytics();
        return c18476l;
    }

    public static int smaato(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static boolean startapp(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004d -> B:26:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0062 -> B:25:0x0067). Please report as a decompilation issue!!! */
    public static final Object subs(InterfaceC9354l interfaceC9354l, long j, AbstractC0283l abstractC0283l) {
        C8916l c8916l;
        C8916l c8916l2;
        long j2;
        InterfaceC9354l interfaceC9354l2;
        long j3;
        long j4;
        if (abstractC0283l instanceof C8916l) {
            c8916l = (C8916l) abstractC0283l;
            int i = c8916l.f18370l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c8916l.f18370l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c8916l = new C8916l(abstractC0283l);
            }
        } else {
            c8916l = new C8916l(abstractC0283l);
        }
        Object obj = c8916l.f18369l;
        int i2 = c8916l.f18370l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            c8916l2 = c8916l;
            j2 = j;
            if (j > 0 || interfaceC9354l.admob()) {
                return new Long(j2 - j);
            }
            C18476l c18476lMopub = interfaceC9354l.mopub();
            c18476lMopub.getClass();
            if (((int) c18476lMopub.f36079l) == 0) {
                c8916l2.f18372l = interfaceC9354l;
                c8916l2.f18371l = j2;
                c8916l2.f18373l = j;
                c8916l2.f18370l = 1;
                int i3 = AbstractC3458l.yandex;
                Object objAmazon = interfaceC9354l.amazon(1, c8916l2);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objAmazon == enumC9342l) {
                    return enumC9342l;
                }
                interfaceC9354l2 = interfaceC9354l;
                j3 = j;
                j4 = j2;
                c8916l = c8916l2;
            }
            long jMin = Math.min(j, interfaceC9354l.mopub().f36079l);
            AbstractC15639l.loadAd(interfaceC9354l.mopub(), jMin);
            j -= jMin;
            if (j > 0) {
            }
            return new Long(j2 - j);
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j3 = c8916l.f18373l;
        j4 = c8916l.f18371l;
        interfaceC9354l2 = c8916l.f18372l;
        AbstractC2829l.crashlytics(obj);
        long j5 = j3;
        interfaceC9354l = interfaceC9354l2;
        j = j5;
        c8916l2 = c8916l;
        j2 = j4;
        long jMin2 = Math.min(j, interfaceC9354l.mopub().f36079l);
        AbstractC15639l.loadAd(interfaceC9354l.mopub(), jMin2);
        j -= jMin2;
        if (j > 0) {
        }
        return new Long(j2 - j);
    }

    public static final void subscription(InterfaceC14189l interfaceC14189l, Appendable appendable, C17078l c17078l, long j) throws IOException {
        if (j > 0) {
            interfaceC14189l.subscription(j);
            String strCrashlytics = AbstractC17291l.crashlytics(interfaceC14189l.crashlytics(), j);
            appendable.append(strCrashlytics);
            c17078l.f33243l += (long) strCrashlytics.length();
        }
    }

    public static final float tapsense(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static final Serializable m2911throws(InterfaceC9354l interfaceC9354l, AbstractC0283l abstractC0283l) throws Throwable {
        C5036l c5036l;
        if (abstractC0283l instanceof C5036l) {
            c5036l = (C5036l) abstractC0283l;
            int i = c5036l.f10298l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5036l.f10298l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5036l = new C5036l(abstractC0283l);
            }
        } else {
            c5036l = new C5036l(abstractC0283l);
        }
        Object objPro = c5036l.f10299l;
        int i2 = c5036l.f10298l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objPro);
            c5036l.f10298l = 1;
            objPro = pro(interfaceC9354l, c5036l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objPro == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objPro);
        }
        C18476l c18476l = (C18476l) objPro;
        return AbstractC10733l.admob(c18476l, (int) c18476l.f36079l);
    }

    public static C13698l vip(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        C13698l c13698lAds;
        boolean zStartapp = startapp(xmlPullParser, str);
        int i2 = 5;
        Object obj = null;
        int i3 = 0;
        if (zStartapp) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28 && i4 <= 31) {
                return new C13698l(obj, obj, typedValue.data, i2);
            }
            try {
                c13698lAds = C13698l.ads(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                c13698lAds = null;
            }
            if (c13698lAds != null) {
                return c13698lAds;
            }
        }
        return new C13698l(obj, obj, i3, i2);
    }

    public static final void yandex(final boolean z, final long j, final InterfaceC17242l interfaceC17242l, C6956l c6956l, final int i) {
        int i2;
        C6956l c6956l2;
        c6956l.m2133new(-98306080);
        if ((i & 6) == 0) {
            i2 = (c6956l.mopub(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (c6956l.purchase(j) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= c6956l.billing(interfaceC17242l) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c6956l.m2127for(i3 & 1, (i3 & 147) != 146)) {
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (objM2132native == c13863l) {
                objM2132native = new C9111l(z);
                c6956l.m2147try(objM2132native);
            }
            C9111l c9111l = (C9111l) objM2132native;
            Object objM2132native2 = c6956l.m2132native();
            if (objM2132native2 == c13863l) {
                objM2132native2 = new C1072l();
                c6956l.m2147try(objM2132native2);
            }
            C1072l c1072l = (C1072l) objM2132native2;
            float f = !z ? 1.0f : 0.0f;
            boolean zAdmob = c6956l.admob(c9111l);
            Object objM2132native3 = c6956l.m2132native();
            if (zAdmob || objM2132native3 == c13863l) {
                objM2132native3 = new C8250l(18, c9111l);
                c6956l.m2147try(objM2132native3);
            }
            InterfaceC12244l interfaceC12244lLoadAd = AbstractC16245l.loadAd(f, null, null, (Function1) objM2132native3, c6956l, 0, 14);
            c6956l2 = c6956l;
            boolean zBilling = c6956l2.billing(interfaceC12244lLoadAd) | c6956l2.admob(c9111l) | ((i3 & 112) == 32);
            Object objM2132native4 = c6956l2.m2132native();
            if (zBilling || objM2132native4 == c13863l) {
                C1040l c1040l = new C1040l(interfaceC12244lLoadAd, c1072l, c9111l, j);
                c6956l2.m2147try(c1040l);
                objM2132native4 = c1040l;
            }
            AbstractC12155l.yandex(interfaceC17242l, (Function1) objM2132native4, c6956l2, (i3 >> 6) & 14);
        } else {
            c6956l2 = c6956l;
            c6956l2.m2124else();
        }
        C4224l c4224lAds = c6956l2.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new Function2() { // from class: lٖٔٗ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC10310l.yandex(z, j, interfaceC17242l, (C6956l) obj, AbstractC0545l.purchase(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
