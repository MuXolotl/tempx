package defpackage;

import android.text.Layout;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lَٟٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10478l {
    public static final StackTraceElement[] yandex = new StackTraceElement[0];

    public static final String admob(C2234l c2234l) {
        String strMopub = AbstractC17541l.mopub(c2234l, C13566l.yandex);
        if (strMopub.length() == 0) {
            strMopub = "/";
        }
        String strCrashlytics = crashlytics(c2234l);
        if (strCrashlytics.length() == 0) {
            return strMopub;
        }
        return strMopub + " [" + strCrashlytics + ']';
    }

    public static byte[] amazon(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        int i = 32;
        if (bArr.length != 32) {
            C18073l.smaato("Private key must have 32 bytes.");
            return null;
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        int i2 = 0;
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        byte b = (byte) (bArrCopyOf[31] & 127);
        bArrCopyOf[31] = b;
        bArrCopyOf[31] = (byte) (b | 64);
        if (bArr2.length != 32) {
            C18073l.smaato("Public key length is not 32-byte");
            return null;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
        bArrCopyOf2[31] = (byte) (bArrCopyOf2[31] & 127);
        for (int i3 = 0; i3 < 7; i3++) {
            byte[][] bArr3 = AbstractC12155l.loadAd;
            if (MessageDigest.isEqual(bArr3[i3], bArrCopyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(AbstractC1315l.amazon(bArr3[i3])));
            }
        }
        int i4 = 10;
        long[] jArr2 = new long[10];
        for (int i5 = 0; i5 < 10; i5++) {
            int i6 = AbstractC12098l.yandex[i5];
            jArr2[i5] = (((((((long) (bArrCopyOf2[i6 + 1] & 255)) << 8) | ((long) (bArrCopyOf2[i6] & 255))) | (((long) (bArrCopyOf2[i6 + 2] & 255)) << 16)) | (((long) (bArrCopyOf2[i6 + 3] & 255)) << 24)) >> AbstractC12098l.loadAd[i5]) & ((long) AbstractC12098l.crashlytics[i5 & 1]);
        }
        long[] jArr3 = new long[19];
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        jArr5[0] = 1;
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        long[] jArr8 = new long[19];
        jArr8[0] = 1;
        long[] jArr9 = new long[19];
        long[] jArr10 = new long[19];
        jArr10[0] = 1;
        System.arraycopy(jArr2, 0, jArr3, 0, 10);
        while (i2 < i) {
            int i7 = bArrCopyOf[31 - i2] & 255;
            int i8 = 0;
            while (i8 < 8) {
                int i9 = (i7 >> (7 - i8)) & 1;
                AbstractC12155l.purchase(i9, jArr5, jArr3);
                AbstractC12155l.purchase(i9, jArr6, jArr4);
                byte[] bArr4 = bArrCopyOf;
                long[] jArrCopyOf = Arrays.copyOf(jArr5, 10);
                int i10 = i8;
                long[] jArr11 = new long[19];
                int i11 = i7;
                long[] jArr12 = new long[19];
                int i12 = i2;
                long[] jArr13 = new long[19];
                long[] jArr14 = jArr;
                long[] jArr15 = new long[19];
                long[] jArr16 = new long[19];
                long[] jArr17 = jArr10;
                long[] jArr18 = new long[19];
                long[] jArr19 = new long[19];
                AbstractC12098l.smaato(jArr5, jArr5, jArr6);
                AbstractC12098l.firebase(jArr6, jArrCopyOf, jArr6);
                long[] jArrCopyOf2 = Arrays.copyOf(jArr3, 10);
                AbstractC12098l.smaato(jArr3, jArr3, jArr4);
                AbstractC12098l.firebase(jArr4, jArrCopyOf2, jArr4);
                AbstractC12098l.mopub(jArr15, jArr3, jArr6);
                AbstractC12098l.mopub(jArr16, jArr5, jArr4);
                AbstractC12098l.subs(jArr15);
                AbstractC12098l.admob(jArr15);
                AbstractC12098l.subs(jArr16);
                AbstractC12098l.admob(jArr16);
                long[] jArr20 = jArr3;
                System.arraycopy(jArr15, 0, jArrCopyOf2, 0, 10);
                AbstractC12098l.smaato(jArr15, jArr15, jArr16);
                AbstractC12098l.firebase(jArr16, jArrCopyOf2, jArr16);
                AbstractC12098l.isPro(jArr19, jArr15);
                AbstractC12098l.isPro(jArr18, jArr16);
                AbstractC12098l.mopub(jArr16, jArr18, jArr2);
                AbstractC12098l.subs(jArr16);
                AbstractC12098l.admob(jArr16);
                System.arraycopy(jArr19, 0, jArr7, 0, 10);
                System.arraycopy(jArr16, 0, jArr8, 0, 10);
                AbstractC12098l.isPro(jArr12, jArr5);
                AbstractC12098l.isPro(jArr13, jArr6);
                AbstractC12098l.mopub(jArr9, jArr12, jArr13);
                AbstractC12098l.subs(jArr9);
                AbstractC12098l.admob(jArr9);
                AbstractC12098l.firebase(jArr13, jArr12, jArr13);
                Arrays.fill(jArr11, 10, 18, 0L);
                int i13 = 0;
                for (int i14 = 10; i13 < i14; i14 = 10) {
                    jArr11[i13] = jArr13[i13] * 121665;
                    i13++;
                }
                AbstractC12098l.admob(jArr11);
                AbstractC12098l.smaato(jArr11, jArr11, jArr12);
                AbstractC12098l.mopub(jArr17, jArr13, jArr11);
                AbstractC12098l.subs(jArr17);
                AbstractC12098l.admob(jArr17);
                AbstractC12155l.purchase(i9, jArr9, jArr7);
                AbstractC12155l.purchase(i9, jArr17, jArr8);
                i8 = i10 + 1;
                long[] jArr21 = jArr8;
                jArr8 = jArr4;
                jArr4 = jArr21;
                long[] jArr22 = jArr9;
                jArr9 = jArr5;
                jArr5 = jArr22;
                long[] jArr23 = jArr6;
                jArr6 = jArr17;
                jArr10 = jArr23;
                jArr3 = jArr7;
                bArrCopyOf = bArr4;
                i7 = i11;
                i2 = i12;
                jArr = jArr14;
                jArr7 = jArr20;
            }
            i2++;
            i = 32;
            i4 = 10;
        }
        long[] jArr24 = jArr;
        int i15 = i4;
        long[] jArr25 = new long[i15];
        long[] jArr26 = new long[i15];
        long[] jArr27 = new long[i15];
        long[] jArr28 = new long[i15];
        long[] jArr29 = new long[i15];
        long[] jArr30 = new long[i15];
        long[] jArr31 = new long[i15];
        long[] jArr32 = new long[i15];
        long[] jArr33 = new long[i15];
        long[] jArr34 = new long[i15];
        long[] jArr35 = jArr3;
        long[] jArr36 = new long[i15];
        AbstractC12098l.isPro(jArr26, jArr6);
        AbstractC12098l.isPro(jArr36, jArr26);
        AbstractC12098l.isPro(jArr34, jArr36);
        AbstractC12098l.billing(jArr27, jArr34, jArr6);
        AbstractC12098l.billing(jArr28, jArr27, jArr26);
        AbstractC12098l.isPro(jArr34, jArr28);
        AbstractC12098l.billing(jArr29, jArr34, jArr27);
        AbstractC12098l.isPro(jArr34, jArr29);
        AbstractC12098l.isPro(jArr36, jArr34);
        AbstractC12098l.isPro(jArr34, jArr36);
        AbstractC12098l.isPro(jArr36, jArr34);
        AbstractC12098l.isPro(jArr34, jArr36);
        AbstractC12098l.billing(jArr30, jArr34, jArr29);
        AbstractC12098l.isPro(jArr34, jArr30);
        AbstractC12098l.isPro(jArr36, jArr34);
        for (int i16 = 2; i16 < 10; i16 += 2) {
            AbstractC12098l.isPro(jArr34, jArr36);
            AbstractC12098l.isPro(jArr36, jArr34);
        }
        AbstractC12098l.billing(jArr31, jArr36, jArr30);
        AbstractC12098l.isPro(jArr34, jArr31);
        AbstractC12098l.isPro(jArr36, jArr34);
        for (int i17 = 2; i17 < 20; i17 += 2) {
            AbstractC12098l.isPro(jArr34, jArr36);
            AbstractC12098l.isPro(jArr36, jArr34);
        }
        AbstractC12098l.billing(jArr34, jArr36, jArr31);
        AbstractC12098l.isPro(jArr36, jArr34);
        AbstractC12098l.isPro(jArr34, jArr36);
        for (int i18 = 2; i18 < 10; i18 += 2) {
            AbstractC12098l.isPro(jArr36, jArr34);
            AbstractC12098l.isPro(jArr34, jArr36);
        }
        AbstractC12098l.billing(jArr32, jArr34, jArr30);
        AbstractC12098l.isPro(jArr34, jArr32);
        AbstractC12098l.isPro(jArr36, jArr34);
        for (int i19 = 2; i19 < 50; i19 += 2) {
            AbstractC12098l.isPro(jArr34, jArr36);
            AbstractC12098l.isPro(jArr36, jArr34);
        }
        AbstractC12098l.billing(jArr33, jArr36, jArr32);
        AbstractC12098l.isPro(jArr36, jArr33);
        AbstractC12098l.isPro(jArr34, jArr36);
        for (int i20 = 2; i20 < 100; i20 += 2) {
            AbstractC12098l.isPro(jArr36, jArr34);
            AbstractC12098l.isPro(jArr34, jArr36);
        }
        AbstractC12098l.billing(jArr36, jArr34, jArr33);
        AbstractC12098l.isPro(jArr34, jArr36);
        AbstractC12098l.isPro(jArr36, jArr34);
        for (int i21 = 2; i21 < 50; i21 += 2) {
            AbstractC12098l.isPro(jArr34, jArr36);
            AbstractC12098l.isPro(jArr36, jArr34);
        }
        AbstractC12098l.billing(jArr34, jArr36, jArr32);
        AbstractC12098l.isPro(jArr36, jArr34);
        AbstractC12098l.isPro(jArr34, jArr36);
        AbstractC12098l.isPro(jArr36, jArr34);
        AbstractC12098l.isPro(jArr34, jArr36);
        AbstractC12098l.isPro(jArr36, jArr34);
        AbstractC12098l.billing(jArr25, jArr36, jArr28);
        AbstractC12098l.billing(jArr24, jArr5, jArr25);
        long[] jArr37 = new long[10];
        long[] jArr38 = new long[10];
        long[] jArr39 = new long[11];
        long[] jArr40 = new long[11];
        long[] jArr41 = new long[11];
        AbstractC12098l.billing(jArr37, jArr2, jArr24);
        AbstractC12098l.smaato(jArr38, jArr2, jArr24);
        long[] jArr42 = new long[10];
        jArr42[0] = 486662;
        AbstractC12098l.smaato(jArr40, jArr38, jArr42);
        AbstractC12098l.billing(jArr40, jArr40, jArr4);
        AbstractC12098l.smaato(jArr40, jArr40, jArr35);
        AbstractC12098l.billing(jArr40, jArr40, jArr37);
        AbstractC12098l.billing(jArr40, jArr40, jArr35);
        for (int i22 = 0; i22 < 10; i22++) {
            jArr39[i22] = jArr40[i22] * 4;
        }
        AbstractC12098l.admob(jArr39);
        AbstractC12098l.billing(jArr40, jArr37, jArr4);
        AbstractC12098l.firebase(jArr40, jArr40, jArr4);
        AbstractC12098l.billing(jArr41, jArr38, jArr35);
        AbstractC12098l.smaato(jArr40, jArr40, jArr41);
        AbstractC12098l.isPro(jArr40, jArr40);
        if (MessageDigest.isEqual(AbstractC12098l.loadAd(jArr39), AbstractC12098l.loadAd(jArr40))) {
            return AbstractC12098l.loadAd(jArr24);
        }
        C8339l.smaato("Arithmetic error in curve multiplication with the public key: ".concat(AbstractC1315l.amazon(bArr2)));
        return null;
    }

    public static final int billing(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final String crashlytics(C2234l c2234l) {
        C2234l c2234l2 = c2234l.f4918l;
        String strCrashlytics = c2234l2 != null ? crashlytics(c2234l2) : null;
        AbstractC15096l abstractC15096l = c2234l.f4915l;
        if ((abstractC15096l instanceof C5376l) || (abstractC15096l instanceof C2023l) || (abstractC15096l instanceof C8287l) || (abstractC15096l instanceof C9702l) || (abstractC15096l instanceof C8049l)) {
            return strCrashlytics == null ? "" : strCrashlytics;
        }
        String string = abstractC15096l.toString();
        if (strCrashlytics == null || strCrashlytics.length() == 0) {
            return string;
        }
        return string.length() == 0 ? strCrashlytics : AbstractC9361l.pro(strCrashlytics, ", ", string);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void loadAd(C10092l[] c10092lArr, Function2 function2, C6956l c6956l, int i) {
        InterfaceC18556l interfaceC18556lM2143this;
        boolean z;
        C4224l c4224lAds;
        c6956l.m2133new(415205898);
        C16535l c16535l = c6956l.ad;
        InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
        c6956l.m2122continue(201, AbstractC2032l.loadAd);
        if (c6956l.f14603switch) {
            interfaceC18556lM2143this = c6956l.m2143this(interfaceC18556lSmaato, AbstractC9690l.mopub(c10092lArr, interfaceC18556lSmaato, C11890l.f23708l));
            c6956l.f14607volatile = true;
        } else {
            C5296l c5296l = c6956l.f14600package;
            InterfaceC18556l interfaceC18556l = (InterfaceC18556l) c5296l.admob(c5296l.mopub, 0);
            C5296l c5296l2 = c6956l.f14600package;
            InterfaceC18556l interfaceC18556l2 = (InterfaceC18556l) c5296l2.admob(c5296l2.mopub, 1);
            C11890l c11890lMopub = AbstractC9690l.mopub(c10092lArr, interfaceC18556lSmaato, interfaceC18556l2);
            if (!c6956l.isVip() || c6956l.advert || !AbstractC8576l.yandex(interfaceC18556l2, c11890lMopub)) {
                interfaceC18556lM2143this = c6956l.m2143this(interfaceC18556lSmaato, c11890lMopub);
                if (c6956l.advert || !AbstractC8576l.yandex(interfaceC18556lM2143this, interfaceC18556l)) {
                    z = true;
                }
                if (z && !c6956l.f14603switch) {
                    c6956l.m2139strictfp(interfaceC18556lM2143this);
                }
                c16535l.purchase(c6956l.pro ? 1 : 0);
                c6956l.pro = z;
                c6956l.f14599native = interfaceC18556lM2143this;
                c6956l.m2119case(202, AbstractC2032l.crashlytics, interfaceC18556lM2143this, 0);
                function2.invoke(c6956l, Integer.valueOf((i >> 3) & 14));
                c6956l.startapp(false);
                c6956l.startapp(false);
                c6956l.pro = c16535l.amazon() != 0;
                c6956l.f14599native = null;
                c4224lAds = c6956l.ads();
                if (c4224lAds != null) {
                    c4224lAds.amazon = new C0741l(c10092lArr, function2, i, 6);
                }
            }
            c6956l.smaato = c6956l.f14600package.subscription() + c6956l.smaato;
            interfaceC18556lM2143this = interfaceC18556l;
        }
        z = false;
        if (z) {
            c6956l.m2139strictfp(interfaceC18556lM2143this);
        }
        c16535l.purchase(c6956l.pro ? 1 : 0);
        c6956l.pro = z;
        c6956l.f14599native = interfaceC18556lM2143this;
        c6956l.m2119case(202, AbstractC2032l.crashlytics, interfaceC18556lM2143this, 0);
        function2.invoke(c6956l, Integer.valueOf((i >> 3) & 14));
        c6956l.startapp(false);
        c6956l.startapp(false);
        c6956l.pro = c16535l.amazon() != 0;
        c6956l.f14599native = null;
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(c10092lArr, function2, i, 6);
        }
    }

    public static byte[] mopub(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            C18073l.smaato("Private key must have 32 bytes.");
            return null;
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return amazon(bArr, bArr2);
    }

    public static byte[] purchase() {
        byte[] bArrYandex = AbstractC14640l.yandex(32);
        bArrYandex[0] = (byte) (bArrYandex[0] | 7);
        byte b = (byte) (bArrYandex[31] & 63);
        bArrYandex[31] = b;
        bArrYandex[31] = (byte) (b | 128);
        return bArrYandex;
    }

    public static final C10707l subs(Function0 function0) {
        return new C10707l(function0);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void yandex(C10092l c10092l, Function2 function2, C6956l c6956l, int i) {
        boolean z;
        C4224l c4224lAds;
        c6956l.m2133new(-149765515);
        C16535l c16535l = c6956l.ad;
        InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
        c6956l.m2122continue(201, AbstractC2032l.loadAd);
        Object objM2132native = c6956l.m2132native();
        InterfaceC2180l interfaceC2180l = AbstractC8576l.yandex(objM2132native, C1867l.yandex) ? null : (InterfaceC2180l) objM2132native;
        AbstractC5189l abstractC5189l = c10092l.yandex;
        InterfaceC2180l interfaceC2180lAmazon = abstractC5189l.amazon(c10092l, interfaceC2180l);
        boolean zEquals = interfaceC2180lAmazon.equals(interfaceC2180l);
        if (!zEquals) {
            c6956l.m2147try(interfaceC2180lAmazon);
        }
        if (!c6956l.f14603switch) {
            C5296l c5296l = c6956l.f14600package;
            InterfaceC18556l interfaceC18556l = (InterfaceC18556l) c5296l.loadAd(c5296l.loadAd, c5296l.mopub);
            if (!(c6956l.isVip() && zEquals) && (c10092l.mopub || !((C11890l) interfaceC18556lSmaato).containsKey(abstractC5189l))) {
                interfaceC18556lSmaato = ((C11890l) interfaceC18556lSmaato).amazon(abstractC5189l, interfaceC2180lAmazon);
            } else if ((zEquals && !c6956l.pro) || !c6956l.pro) {
                interfaceC18556lSmaato = interfaceC18556l;
            }
            if (c6956l.advert || interfaceC18556l != interfaceC18556lSmaato) {
                z = true;
            }
            if (z && !c6956l.f14603switch) {
                c6956l.m2139strictfp(interfaceC18556lSmaato);
            }
            c16535l.purchase(c6956l.pro ? 1 : 0);
            c6956l.pro = z;
            c6956l.f14599native = interfaceC18556lSmaato;
            c6956l.m2119case(202, AbstractC2032l.crashlytics, interfaceC18556lSmaato, 0);
            function2.invoke(c6956l, Integer.valueOf((i >> 3) & 14));
            c6956l.startapp(false);
            c6956l.startapp(false);
            c6956l.pro = c16535l.amazon() != 0;
            c6956l.f14599native = null;
            c4224lAds = c6956l.ads();
            if (c4224lAds != null) {
                c4224lAds.amazon = new C0741l(c10092l, function2, i, 5);
            }
        }
        if (c10092l.mopub || !((C11890l) interfaceC18556lSmaato).containsKey(abstractC5189l)) {
            interfaceC18556lSmaato = ((C11890l) interfaceC18556lSmaato).amazon(abstractC5189l, interfaceC2180lAmazon);
        }
        c6956l.f14607volatile = true;
        z = false;
        if (z) {
            c6956l.m2139strictfp(interfaceC18556lSmaato);
        }
        c16535l.purchase(c6956l.pro ? 1 : 0);
        c6956l.pro = z;
        c6956l.f14599native = interfaceC18556lSmaato;
        c6956l.m2119case(202, AbstractC2032l.crashlytics, interfaceC18556lSmaato, 0);
        function2.invoke(c6956l, Integer.valueOf((i >> 3) & 14));
        c6956l.startapp(false);
        c6956l.startapp(false);
        c6956l.pro = c16535l.amazon() != 0;
        c6956l.f14599native = null;
        c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C0741l(c10092l, function2, i, 5);
        }
    }
}
