package defpackage;

import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lؙۨ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6928l implements InterfaceC15514l, InterfaceC1465l, InterfaceC15244l, InterfaceC5152l, InterfaceC14713l, InterfaceC15270l, InterfaceC13540l, InterfaceC5404l, InterfaceC17030l, InterfaceC12575l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14522l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C6928l f14508l = new C6928l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C18353l f14501l = new C18353l(17);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C6928l f14514l = new C6928l(3);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C6928l f14513l = new C6928l(4);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C6928l f14517l = new C6928l(5);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C6928l f14502l = new C6928l(6);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C6928l f14505l = new C6928l(7);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ C6928l f14516l = new C6928l(8);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C6928l f14511l = new C6928l(9);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C6928l f14518l = new C6928l(10);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C6928l f14515l = new C6928l(11);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C6928l f14500l = new C6928l(12);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C6928l f14519l = new C6928l(13);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C6928l f14512l = new C6928l(14);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C6928l f14506l = new C6928l(15);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C6928l f14510l = new C6928l(16);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C6928l f14520l = new C6928l(17);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C6928l f14509l = new C6928l(18);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C6928l f14504l = new C6928l(19);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C6928l f14503l = new C6928l(20);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final C6928l f14499l = new C6928l(21);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C6928l f14521l = new C6928l(22);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final C6928l f14507l = new C6928l(23);

    public C6928l(Set set) {
        this.f14522l = 0;
        new HashMap();
        new HashMap();
        Iterator it = set.iterator();
        if (it.hasNext()) {
            throw AbstractC15560l.adcel(it);
        }
    }

    @Override // defpackage.InterfaceC5404l
    public void Signature(InterfaceC13490l interfaceC13490l, int i, int[] iArr, EnumC9931l enumC9931l, int[] iArr2) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int length = iArr.length;
        int i5 = i - i3;
        int i6 = 0;
        while (i2 < length) {
            int i7 = iArr[i2];
            iArr2[i6] = i5;
            i5 += i7;
            i2++;
            i6++;
        }
    }

    @Override // defpackage.InterfaceC12575l
    public SecureRandom adcel() {
        return SecureRandom.getInstance("DEFAULT");
    }

    @Override // defpackage.InterfaceC15270l
    public byte[] admob(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        if (bigInteger2.signum() < 0 || (bigInteger != null && bigInteger2.compareTo(bigInteger) >= 0)) {
            C8339l.metrica("Value out of range");
            return null;
        }
        Cstrictfp cstrictfp = new Cstrictfp(bigInteger2);
        if (bigInteger3.signum() < 0 || (bigInteger != null && bigInteger3.compareTo(bigInteger) >= 0)) {
            C8339l.metrica("Value out of range");
            return null;
        }
        C11138l c11138l = new C11138l(cstrictfp, new Cstrictfp(bigInteger3));
        c11138l.f22357l = -1;
        return c11138l.remoteconfig("DER");
    }

    @Override // defpackage.InterfaceC12575l
    public AlgorithmParameters advert(String str) {
        return AlgorithmParameters.getInstance(str);
    }

    @Override // defpackage.InterfaceC5404l
    public /* synthetic */ float amazon() {
        return 0.0f;
    }

    @Override // defpackage.InterfaceC17030l
    public long billing(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        int i = AbstractC7789l.yandex;
        return jFloatToRawIntBits;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5152l
    /* JADX INFO: renamed from: continue */
    public void mo804continue(C16864l c16864l, AbstractC5563l abstractC5563l) {
        C12222l c12222l = new C12222l("BeforeReceive");
        C8403l c8403l = c16864l.f32913l;
        c8403l.isPro(C8403l.f17394l, c12222l);
        c8403l.firebase(c12222l, new C3341l((Function3) abstractC5563l, null, 1));
    }

    @Override // defpackage.InterfaceC12575l
    public MessageDigest crashlytics(String str) {
        return MessageDigest.getInstance(str);
    }

    @Override // defpackage.InterfaceC12575l
    public Signature createSignature(String str) {
        return Signature.getInstance(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r5 == r2) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object firebase(defpackage.AbstractC0301l r6, defpackage.AbstractC0283l r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C8820l
            if (r0 == 0) goto L13
            r0 = r7
            lٌٖۡ r0 = (defpackage.C8820l) r0
            int r1 = r0.f18106l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18106l = r1
            goto L18
        L13:
            lٌٖۡ r0 = new lٌٖۡ
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r5 = r0.f18107l
            int r7 = r0.f18106l
            r1 = 1
            lٍؗؐ r2 = defpackage.EnumC9342l.f19165l
            r3 = 2
            r4 = 0
            if (r7 == 0) goto L37
            if (r7 == r1) goto L31
            if (r7 != r3) goto L2b
            defpackage.AbstractC2829l.crashlytics(r5)     // Catch: java.lang.Exception -> L6f
            goto L73
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r5)
            return r4
        L31:
            lْؑۨ r6 = r0.f18108l
            defpackage.AbstractC2829l.crashlytics(r5)     // Catch: java.lang.Exception -> L6f
            goto L49
        L37:
            defpackage.AbstractC2829l.crashlytics(r5)
            lٓؐٛ r5 = r6.loadAd()     // Catch: java.lang.Exception -> L6f
            r0.f18108l = r6     // Catch: java.lang.Exception -> L6f
            r0.f18106l = r1     // Catch: java.lang.Exception -> L6f
            java.lang.Object r5 = r5.loadAd(r0)     // Catch: java.lang.Exception -> L6f
            if (r5 != r2) goto L49
            goto L6e
        L49:
            bruhcollective.itaysonlab.libvkmusic.methods.uma.GetPersonalRadio$Preapi r5 = (bruhcollective.itaysonlab.libvkmusic.methods.uma.GetPersonalRadio$Preapi) r5     // Catch: java.lang.Exception -> L6f
            if (r5 == 0) goto L73
            bruhcollective.itaysonlab.libvkmusic.objects.RadioInfo r5 = r5.yandex     // Catch: java.lang.Exception -> L6f
            if (r5 == 0) goto L73
            lٕۣ۟ r7 = new lٕۣ۟     // Catch: java.lang.Exception -> L6f
            r7.<init>(r6, r5)     // Catch: java.lang.Exception -> L6f
            r0.f18108l = r4     // Catch: java.lang.Exception -> L6f
            r0.f18106l = r3     // Catch: java.lang.Exception -> L6f
            lِْٙ r5 = defpackage.C13305l.mopub     // Catch: java.lang.Exception -> L6f
            lٖۖ r6 = defpackage.AbstractC11463l.yandex     // Catch: java.lang.Exception -> L6f
            lّۣؖ r1 = new lّۣؖ     // Catch: java.lang.Exception -> L6f
            r1.<init>(r5, r7, r4, r3)     // Catch: java.lang.Exception -> L6f
            java.lang.Object r5 = defpackage.AbstractC10999l.firebase(r6, r1, r0)     // Catch: java.lang.Exception -> L6f
            if (r5 != r2) goto L6a
            goto L6c
        L6a:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L6f
        L6c:
            if (r5 != r2) goto L73
        L6e:
            return r2
        L6f:
            r5 = move-exception
            r5.printStackTrace()
        L73:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6928l.firebase(lْؑۨ, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b1, code lost:
    
        if (r11 == r8) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [lؙۨ۟] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.Serializable isPro(boolean r12, defpackage.AbstractC0283l r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.C16316l
            if (r0 == 0) goto L13
            r0 = r13
            lُٖؒ r0 = (defpackage.C16316l) r0
            int r1 = r0.f31912l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31912l = r1
            goto L18
        L13:
            lُٖؒ r0 = new lُٖؒ
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f31915l
            int r1 = r0.f31912l
            lّؔۜ r2 = defpackage.C2580l.f5619l
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            lٍؗؐ r8 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L52
            if (r1 == r6) goto L4c
            if (r1 == r5) goto L44
            if (r1 == r4) goto L3e
            if (r1 != r3) goto L38
            defpackage.AbstractC2829l.crashlytics(r13)
            lٍٖۨ r13 = (defpackage.C16302l) r13
            lًۖٔ r11 = r13.yandex
            goto Lb4
        L38:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r11)
            return r7
        L3e:
            boolean r12 = r0.f31914l
            defpackage.AbstractC2829l.crashlytics(r13)
            goto La7
        L44:
            boolean r12 = r0.f31914l
            java.util.List r1 = r0.f31913l
            defpackage.AbstractC2829l.crashlytics(r13)     // Catch: java.lang.Exception -> L8a
            goto L86
        L4c:
            boolean r12 = r0.f31914l
            defpackage.AbstractC2829l.crashlytics(r13)     // Catch: java.lang.Exception -> L6f
            goto L69
        L52:
            defpackage.AbstractC2829l.crashlytics(r13)
            lؙۣؖ r13 = new lؙۣؖ     // Catch: java.lang.Exception -> L6f
            java.lang.String r1 = "/radio/artist/profile/"
            java.lang.Class<bruhcollective.itaysonlab.libvkmusic.methods.uma.GetRadioArtists$Preapi> r9 = bruhcollective.itaysonlab.libvkmusic.methods.uma.GetRadioArtists$Preapi.class
            r13.<init>(r9, r1)     // Catch: java.lang.Exception -> L6f
            r0.f31914l = r12     // Catch: java.lang.Exception -> L6f
            r0.f31912l = r6     // Catch: java.lang.Exception -> L6f
            java.lang.Object r13 = r13.loadAd(r0)     // Catch: java.lang.Exception -> L6f
            if (r13 != r8) goto L69
            goto Lb3
        L69:
            bruhcollective.itaysonlab.libvkmusic.methods.uma.GetRadioArtists$Preapi r13 = (bruhcollective.itaysonlab.libvkmusic.methods.uma.GetRadioArtists$Preapi) r13     // Catch: java.lang.Exception -> L6f
            java.util.List r13 = r13.yandex     // Catch: java.lang.Exception -> L6f
            r1 = r13
            goto L70
        L6f:
            r1 = r2
        L70:
            lؙۣؖ r13 = new lؙۣؖ     // Catch: java.lang.Exception -> L8a
            java.lang.String r9 = "/radio/tag/profile/"
            java.lang.Class<bruhcollective.itaysonlab.libvkmusic.methods.uma.GetRadioTags$Preapi> r10 = bruhcollective.itaysonlab.libvkmusic.methods.uma.GetRadioTags$Preapi.class
            r13.<init>(r10, r9)     // Catch: java.lang.Exception -> L8a
            r0.f31913l = r1     // Catch: java.lang.Exception -> L8a
            r0.f31914l = r12     // Catch: java.lang.Exception -> L8a
            r0.f31912l = r5     // Catch: java.lang.Exception -> L8a
            java.lang.Object r13 = r13.loadAd(r0)     // Catch: java.lang.Exception -> L8a
            if (r13 != r8) goto L86
            goto Lb3
        L86:
            bruhcollective.itaysonlab.libvkmusic.methods.uma.GetRadioTags$Preapi r13 = (bruhcollective.itaysonlab.libvkmusic.methods.uma.GetRadioTags$Preapi) r13     // Catch: java.lang.Exception -> L8a
            java.util.List r2 = r13.yandex     // Catch: java.lang.Exception -> L8a
        L8a:
            boolean r13 = r1.isEmpty()
            if (r13 == 0) goto Lb7
            boolean r13 = r2.isEmpty()
            if (r13 == 0) goto Lb7
            if (r12 != 0) goto Lb7
            lؘٟؕ r13 = defpackage.C3544l.yandex
            r0.f31913l = r7
            r0.f31914l = r12
            r0.f31912l = r4
            java.lang.Object r13 = r13.crashlytics(r0)
            if (r13 != r8) goto La7
            goto Lb3
        La7:
            r0.f31913l = r7
            r0.f31914l = r12
            r0.f31912l = r3
            java.io.Serializable r11 = r11.isPro(r6, r0)
            if (r11 != r8) goto Lb4
        Lb3:
            return r8
        Lb4:
            lًۖٔ r11 = (defpackage.C8195l) r11
            return r11
        Lb7:
            lًۖٔ r11 = new lًۖٔ
            r11.<init>(r1, r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6928l.isPro(boolean, lّؑۧ):java.io.Serializable");
    }

    @Override // defpackage.InterfaceC15514l
    public Object loadAd(C14187l c14187l, ClassLoader classLoader, ArrayList arrayList, InterfaceC14029l interfaceC14029l) throws Throwable {
        ArrayList arrayList2 = new ArrayList();
        Object objFirebase = AbstractC10999l.firebase(c14187l.f27778l.mo246l(new C16909l(c14187l, arrayList2)).mo246l(AbstractC11463l.yandex.mo1066while(1)), new C1914l(arrayList, c14187l, arrayList2, classLoader, (InterfaceC14029l) null, 2), interfaceC14029l);
        return objFirebase == EnumC9342l.f19165l ? objFirebase : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC14713l
    public long mopub(C3737l c3737l, int i) {
        String str = c3737l.billing.yandex.yandex.f7563l;
        return AbstractC2296l.loadAd(AbstractC17195l.purchase(str, i), AbstractC17195l.amazon(str, i));
    }

    @Override // defpackage.InterfaceC12575l
    public KeyFactory premium(String str) {
        return KeyFactory.getInstance(str);
    }

    @Override // defpackage.InterfaceC12575l
    public CertificateFactory pro(String str) {
        return CertificateFactory.getInstance(str);
    }

    @Override // defpackage.InterfaceC1465l
    public float purchase(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.InterfaceC15244l
    public Object remoteconfig(C11644l c11644l) {
        return AbstractC5103l.billing((Executor) c11644l.mo622l(new C12638l(InterfaceC8866l.class, Executor.class)));
    }

    @Override // defpackage.InterfaceC12575l
    public SecretKeyFactory signatures(String str) {
        return SecretKeyFactory.getInstance(str);
    }

    public void smaato(C10023l c10023l, float f) {
        C3708l c3708l = (C3708l) c10023l.f20419l;
        boolean useCompatPadding = ((AbstractC2568l) c10023l.f20418l).getUseCompatPadding();
        boolean preventCornerOverlap = ((AbstractC2568l) c10023l.f20418l).getPreventCornerOverlap();
        if (f != c3708l.purchase || c3708l.billing != useCompatPadding || c3708l.mopub != preventCornerOverlap) {
            c3708l.purchase = f;
            c3708l.billing = useCompatPadding;
            c3708l.mopub = preventCornerOverlap;
            c3708l.loadAd(null);
            c3708l.invalidateSelf();
        }
        vip(c10023l);
    }

    @Override // defpackage.InterfaceC12575l
    public Mac startapp(String str) {
        return Mac.getInstance(str);
    }

    @Override // defpackage.InterfaceC12575l
    public Cipher subs(String str) {
        return Cipher.getInstance(str);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x0149  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.InterfaceC13540l
    /* JADX INFO: renamed from: throws */
    public Object mo805throws(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C5857l c5857l;
        InterfaceC13012l interfaceC13012lLoadAd;
        C13990l c13990l;
        InterfaceC13012l interfaceC13012lLoadAd2;
        C10859l c10859l;
        InterfaceC13012l interfaceC13012lLoadAd3;
        C13770l c13770l;
        InterfaceC13012l interfaceC13012lLoadAd4;
        int i = this.f14522l;
        Class cls = Integer.TYPE;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 13:
                if (abstractC0283l instanceof C5857l) {
                    c5857l = (C5857l) abstractC0283l;
                    int i2 = c5857l.f12348l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c5857l.f12348l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c5857l = new C5857l(this, abstractC0283l);
                    }
                } else {
                    c5857l = new C5857l(this, abstractC0283l);
                }
                Object objYandex = c5857l.f12349l;
                int i3 = c5857l.f12348l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC2829l.crashlytics(objYandex);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex);
                C14249l c14249lLoadAd = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l = C0861l.crashlytics;
                    interfaceC13012lLoadAd = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(cls)));
                } catch (Throwable unused) {
                    interfaceC13012lLoadAd = null;
                }
                C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd);
                c5857l.f12348l = 1;
                objYandex = c14249lLoadAd.yandex(c11310l, c5857l);
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex != null) {
                    return (C0951l) objYandex;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 14:
                if (abstractC0283l instanceof C13990l) {
                    c13990l = (C13990l) abstractC0283l;
                    int i4 = c13990l.f27293l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c13990l.f27293l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c13990l = new C13990l(this, abstractC0283l);
                    }
                } else {
                    c13990l = new C13990l(this, abstractC0283l);
                }
                Object objYandex2 = c13990l.f27294l;
                int i5 = c13990l.f27293l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(objYandex2);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex2);
                C14249l c14249lLoadAd2 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd2 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l2 = C0861l.crashlytics;
                    interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(cls)));
                } catch (Throwable unused2) {
                    interfaceC13012lLoadAd2 = null;
                }
                C11310l c11310l2 = new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd2);
                c13990l.f27293l = 1;
                objYandex2 = c14249lLoadAd2.yandex(c11310l2, c13990l);
                if (objYandex2 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex2 != null) {
                    return (C0951l) objYandex2;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            case 15:
                if (abstractC0283l instanceof C10859l) {
                    c10859l = (C10859l) abstractC0283l;
                    int i6 = c10859l.f21953l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c10859l.f21953l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c10859l = new C10859l(this, abstractC0283l);
                    }
                } else {
                    c10859l = new C10859l(this, abstractC0283l);
                }
                Object objYandex3 = c10859l.f21954l;
                int i7 = c10859l.f21953l;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC2829l.crashlytics(objYandex3);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex3);
                C14249l c14249lLoadAd3 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd3 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l3 = C0861l.crashlytics;
                    interfaceC13012lLoadAd3 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C7906l.class)));
                } catch (Throwable unused3) {
                    interfaceC13012lLoadAd3 = null;
                }
                C11310l c11310l3 = new C11310l(interfaceC1388lLoadAd3, interfaceC13012lLoadAd3);
                c10859l.f21953l = 1;
                objYandex3 = c14249lLoadAd3.yandex(c11310l3, c10859l);
                if (objYandex3 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex3 != null) {
                    return (C0951l) objYandex3;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            default:
                if (abstractC0283l instanceof C13770l) {
                    c13770l = (C13770l) abstractC0283l;
                    int i8 = c13770l.f26860l;
                    if ((i8 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c13770l.f26860l = i8 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c13770l = new C13770l(this, abstractC0283l);
                    }
                } else {
                    c13770l = new C13770l(this, abstractC0283l);
                }
                Object objYandex4 = c13770l.f26861l;
                int i9 = c13770l.f26860l;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC2829l.crashlytics(objYandex4);
                    } else {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                AbstractC2829l.crashlytics(objYandex4);
                C14249l c14249lLoadAd4 = abstractC10022l.loadAd();
                InterfaceC1388l interfaceC1388lLoadAd4 = AbstractC18202l.yandex.loadAd(C0951l.class);
                try {
                    C0861l c0861l4 = C0861l.crashlytics;
                    interfaceC13012lLoadAd4 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.loadAd(List.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C4964l.class)))));
                } catch (Throwable unused4) {
                    interfaceC13012lLoadAd4 = null;
                }
                C11310l c11310l4 = new C11310l(interfaceC1388lLoadAd4, interfaceC13012lLoadAd4);
                c13770l.f26860l = 1;
                objYandex4 = c14249lLoadAd4.yandex(c11310l4, c13770l);
                if (objYandex4 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex4 != null) {
                    return (C0951l) objYandex4;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
        }
    }

    public String toString() {
        switch (this.f14522l) {
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return "AbsoluteArrangement#Right";
            default:
                return super.toString();
        }
    }

    public void vip(C10023l c10023l) {
        float f;
        float f2;
        if (!((AbstractC2568l) c10023l.f20418l).getUseCompatPadding()) {
            c10023l.m2826extends(0, 0, 0, 0);
            return;
        }
        C3708l c3708l = (C3708l) c10023l.f20419l;
        float f3 = c3708l.purchase;
        float f4 = c3708l.yandex;
        AbstractC2568l abstractC2568l = (AbstractC2568l) c10023l.f20418l;
        if (abstractC2568l.getPreventCornerOverlap()) {
            f = (float) (((1.0d - AbstractC0618l.yandex) * ((double) f4)) + ((double) f3));
        } else {
            int i = AbstractC0618l.loadAd;
            f = f3;
        }
        int iCeil = (int) Math.ceil(f);
        if (abstractC2568l.getPreventCornerOverlap()) {
            f2 = (float) (((1.0d - AbstractC0618l.yandex) * ((double) f4)) + ((double) (f3 * 1.5f)));
        } else {
            f2 = f3 * 1.5f;
        }
        int iCeil2 = (int) Math.ceil(f2);
        c10023l.m2826extends(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // defpackage.InterfaceC15270l
    public BigInteger[] yandex(BigInteger bigInteger, byte[] bArr) {
        Cclass cclassInmobi = Cclass.inmobi(bArr);
        if (cclassInmobi.size() == 2) {
            BigInteger bigIntegerAppmetrica = ((Cstrictfp) cclassInmobi.mo173throws(0)).appmetrica();
            if (bigIntegerAppmetrica.signum() < 0 || (bigInteger != null && bigIntegerAppmetrica.compareTo(bigInteger) >= 0)) {
                C8339l.metrica("Value out of range");
                return null;
            }
            BigInteger bigIntegerAppmetrica2 = ((Cstrictfp) cclassInmobi.mo173throws(1)).appmetrica();
            if (bigIntegerAppmetrica2.signum() < 0 || (bigInteger != null && bigIntegerAppmetrica2.compareTo(bigInteger) >= 0)) {
                C8339l.metrica("Value out of range");
                return null;
            }
            if (Arrays.equals(admob(bigInteger, bigIntegerAppmetrica, bigIntegerAppmetrica2), bArr)) {
                return new BigInteger[]{bigIntegerAppmetrica, bigIntegerAppmetrica2};
            }
        }
        C8339l.metrica("Malformed signature");
        return null;
    }

    public /* synthetic */ C6928l(int i) {
        this.f14522l = i;
    }
}
