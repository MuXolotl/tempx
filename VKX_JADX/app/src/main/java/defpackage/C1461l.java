package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lؒۥؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C1461l implements InterfaceC17325l, InterfaceC10599l, InterfaceC6128l, InterfaceC6642l, InterfaceC15446l, InterfaceC13540l, InterfaceC8396l, InterfaceC1953l, InterfaceC12925l, InterfaceC5404l, InterfaceC3501l, InterfaceC3881l, InterfaceC17030l, InterfaceC1541l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3671l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final C1461l f3654l = new C1461l(1);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C1461l f3647l = new C1461l(2);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C1461l f3662l = new C1461l(3);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C1461l f3661l = new C1461l(4);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final C1461l f3666l = new C1461l(5);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C1461l f3648l = new C1461l(6);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final C1461l f3651l = new C1461l(7);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C1461l f3665l = new C1461l(8);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final C1461l f3659l = new C1461l(9);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final C11379l f3667l = new C11379l(0);

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public static final C11379l f3664l = new C11379l(1);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final C11379l f3646l = new C11379l(2);

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public static final C11379l f3668l = new C11379l(3);

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public static final C11379l f3660l = new C11379l(4);

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public static final C1461l f3652l = new C1461l(11);

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public static final C1461l f3656l = new C1461l(12);

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public static final C1461l f3669l = new C1461l(13);

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C1461l f3655l = new C1461l(14);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C1461l f3650l = new C1461l(15);

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C1461l f3649l = new C1461l(16);

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public static final /* synthetic */ C1461l f3645l = new C1461l(17);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public static final C1461l f3670l = new C1461l(18);

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public static final C1461l f3653l = new C1461l(19);

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public static final C1461l f3658l = new C1461l(20);

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public static final C1461l f3663l = new C1461l(21);

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public static final C1461l f3644l = new C1461l(22);

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public static final C1461l f3657l = new C1461l(23);

    public /* synthetic */ C1461l(int i) {
        this.f3671l = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object subscription(AbstractC0283l abstractC0283l) {
        C6380l c6380l;
        Iterator it;
        if (abstractC0283l instanceof C6380l) {
            c6380l = (C6380l) abstractC0283l;
            int i = c6380l.f13358l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c6380l.f13358l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c6380l = new C6380l(abstractC0283l);
            }
        } else {
            c6380l = new C6380l(abstractC0283l);
        }
        Object obj = c6380l.f13356l;
        int i2 = c6380l.f13358l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C12382l c12382l = AbstractC5921l.f12465l;
            String str = C14025l.f27330l;
            C8688l c8688l = AbstractC0085l.yandex;
            C14025l c14025lPurchase = C6162l.ads(AbstractC8182l.loadAd().loadAd()).purchase("playlists");
            c12382l.getClass();
            List listM3376super = C12382l.m3376super(c14025lPurchase, false);
            if (listM3376super == null) {
                listM3376super = C2580l.f5619l;
            }
            it = listM3376super.iterator();
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = c6380l.f13357l;
            AbstractC2829l.crashlytics(obj);
        }
        while (it.hasNext()) {
            C14025l c14025l = (C14025l) it.next();
            String strM3325goto = AbstractC12024l.m3325goto(c14025l.loadAd(), ".png");
            AbstractC5921l.f12465l.billing(c14025l, AbstractC0825l.admob(5, strM3325goto));
            c6380l.f13357l = it;
            c6380l.f13358l = 1;
            Object objLicense = f3654l.license(strM3325goto, c6380l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLicense == enumC9342l) {
                return enumC9342l;
            }
        }
        C12382l c12382l2 = AbstractC5921l.f12465l;
        String str2 = C14025l.f27330l;
        C8688l c8688l2 = AbstractC0085l.yandex;
        c12382l2.ads(C6162l.ads(AbstractC8182l.loadAd().loadAd()).purchase("playlists"));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00f7 -> B:22:0x00a3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object tapsense(defpackage.InterfaceC7523l r11, defpackage.AbstractC0283l r12) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1461l.tapsense(lؚۛۡ, lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC5404l
    public void Signature(InterfaceC13490l interfaceC13490l, int i, int[] iArr, EnumC9931l enumC9931l, int[] iArr2) {
        if (enumC9931l == EnumC9931l.f20223l) {
            AbstractC8313l.yandex(i, iArr, iArr2, false);
        } else {
            AbstractC8313l.yandex(i, iArr, iArr2, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        if (pro(r13, false, r0) == r11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        if (pro(r13, true, r0) == r11) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object ad(ua.itaysonlab.vkxreborn.cache.realm.CachedTrack r13, defpackage.AbstractC0283l r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.C2134l
            if (r0 == 0) goto L13
            r0 = r14
            lؓۜ٘ r0 = (defpackage.C2134l) r0
            int r1 = r0.f4770l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4770l = r1
            goto L18
        L13:
            lؓۜ٘ r0 = new lؓۜ٘
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f4771l
            int r1 = r0.f4770l
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            r7 = 0
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            defpackage.AbstractC2829l.crashlytics(r14)
            goto Lb9
        L2f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r12)
            return r7
        L35:
            java.lang.Long r12 = r0.f4772l
            defpackage.AbstractC2829l.crashlytics(r14)
            return r12
        L3b:
            defpackage.AbstractC2829l.crashlytics(r14)
            goto L70
        L3f:
            defpackage.AbstractC2829l.crashlytics(r14)
            ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum r14 = r13.yandex()
            if (r14 == 0) goto L4c
            java.lang.String r7 = r14.remoteconfig()
        L4c:
            java.lang.String r14 = r13.premium()
            if (r14 != 0) goto L58
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r5)
            return r12
        L58:
            lًٓۤ r1 = defpackage.AbstractC0825l.admob(r3, r14)
            lّؕۘ r8 = defpackage.AbstractC5921l.f12465l
            boolean r9 = r8.isVip(r1)
            r10 = 0
            lٍؗؐ r11 = defpackage.EnumC9342l.f19165l
            if (r9 != 0) goto L76
            r0.f4770l = r4
            java.lang.Object r12 = r12.pro(r13, r10, r0)
            if (r12 != r11) goto L70
            goto Lb8
        L70:
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r5)
            return r12
        L76:
            lٙۘ r9 = r8.m1876synchronized(r1)
            if (r7 == 0) goto La9
            r12 = 4
            lًٓۤ r12 = defpackage.AbstractC0825l.admob(r12, r7)
            boolean r14 = r8.isVip(r12)
            if (r14 == 0) goto L93
            r8.adcel(r1, r10)
            java.lang.Long r12 = r9.amazon
            if (r12 == 0) goto L96
            long r5 = r12.longValue()
            goto L96
        L93:
            r8.billing(r1, r12)
        L96:
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r5)
            r0.f4772l = r12
            r0.f4770l = r3
            lؒۥؑ r14 = defpackage.C1461l.f3654l
            java.lang.Object r13 = r14.pro(r13, r10, r0)
            if (r13 != r11) goto La8
            goto Lb8
        La8:
            return r12
        La9:
            lًٓۤ r14 = defpackage.AbstractC0825l.admob(r2, r14)
            r8.billing(r1, r14)
            r0.f4770l = r2
            java.lang.Object r12 = r12.pro(r13, r4, r0)
            if (r12 != r11) goto Lb9
        Lb8:
            return r11
        Lb9:
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r5)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1461l.ad(ua.itaysonlab.vkxreborn.cache.realm.CachedTrack, lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC3881l
    public byte[] adcel() {
        return AbstractC2383l.firebase;
    }

    @Override // defpackage.InterfaceC17325l
    public Iterable admob(Object obj) {
        int i = AbstractC3759l.yandex;
        Collection collectionLicense = ((C17538l) obj).license();
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(collectionLicense, 10));
        Iterator it = ((ArrayList) collectionLicense).iterator();
        while (it.hasNext()) {
            arrayList.add(((C17538l) it.next()).mo864l());
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC10599l
    public AbstractC18041l ads(C18128l c18128l, String str, AbstractC15211l abstractC15211l, AbstractC15211l abstractC15211l2) {
        throw new IllegalArgumentException("This method should not be used.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object advert(AbstractC0283l abstractC0283l) {
        C14186l c14186l;
        if (abstractC0283l instanceof C14186l) {
            c14186l = (C14186l) abstractC0283l;
            int i = c14186l.f27777l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14186l.f27777l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14186l = new C14186l(this, abstractC0283l);
            }
        } else {
            c14186l = new C14186l(this, abstractC0283l);
        }
        Object objM3168l = c14186l.f27776l;
        int i2 = c14186l.f27777l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM3168l);
            C12382l c12382l = AbstractC5921l.f12465l;
            String str = C14025l.f27330l;
            C8688l c8688l = AbstractC0085l.yandex;
            if (c12382l.isVip(C6162l.ads(AbstractC8182l.loadAd().loadAd()).purchase("albums"))) {
                return Boolean.TRUE;
            }
            if (c12382l.isVip(C6162l.ads(AbstractC8182l.loadAd().loadAd()).purchase("playlists"))) {
                return Boolean.TRUE;
            }
            C6336l c6336l = C6336l.yandex;
            c14186l.f27777l = 1;
            objM3168l = C6336l.loadAd.m3168l(c14186l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objM3168l == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objM3168l);
        }
        return Boolean.valueOf(!((C5198l) objM3168l).m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "isLegacyCachedArtwork == TRUE", Arrays.copyOf(new Object[0], 0)).crashlytics().isEmpty());
    }

    @Override // defpackage.InterfaceC5404l
    public float amazon() {
        return 0.0f;
    }

    @Override // defpackage.InterfaceC17030l
    public long billing(long j, long j2) {
        float fYandex = AbstractC8513l.yandex(j, j2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fYandex)) << 32) | (((long) Float.floatToRawIntBits(fYandex)) & 4294967295L);
        int i = AbstractC7789l.yandex;
        return jFloatToRawIntBits;
    }

    @Override // defpackage.InterfaceC12925l
    public C4687l crashlytics(Class cls) {
        if (!AbstractC17187l.class.isAssignableFrom(cls)) {
            C8339l.metrica("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (C4687l) AbstractC17187l.billing(cls.asSubclass(AbstractC17187l.class)).subs(3, null);
        } catch (Exception e) {
            C18073l.Signature("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // defpackage.InterfaceC6642l
    public boolean firebase(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // defpackage.InterfaceC1541l
    public C11911l getKey() {
        return C10541l.crashlytics;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object license(String str, AbstractC0283l abstractC0283l) {
        C0628l c0628l;
        if (abstractC0283l instanceof C0628l) {
            c0628l = (C0628l) abstractC0283l;
            int i = c0628l.f2080l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0628l.f2080l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0628l = new C0628l(this, abstractC0283l);
            }
        } else {
            c0628l = new C0628l(this, abstractC0283l);
        }
        Object objM3168l = c0628l.f2081l;
        int i2 = c0628l.f2080l;
        int i3 = 1;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM3168l);
            C6336l c6336l = C6336l.yandex;
            c0628l.f2082l = str;
            c0628l.f2080l = 1;
            objM3168l = C6336l.loadAd.m3168l(c0628l);
            if (objM3168l != enumC9342l) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC2829l.crashlytics(objM3168l);
                return objM3168l;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = c0628l.f2082l;
        AbstractC2829l.crashlytics(objM3168l);
        C6908l c6908l = new C6908l(str, i3);
        c0628l.f2082l = null;
        c0628l.f2080l = 2;
        Object objM1734l = ((C5198l) objM3168l).m1734l(c6908l, c0628l);
        return objM1734l == enumC9342l ? enumC9342l : objM1734l;
    }

    @Override // defpackage.InterfaceC12925l
    public boolean loadAd(Class cls) {
        return AbstractC17187l.class.isAssignableFrom(cls);
    }

    @Override // defpackage.InterfaceC3881l
    public byte[] mopub(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != 32) {
            C18073l.pro("Unexpected key length: 32");
            return null;
        }
        try {
            C2254l.crashlytics();
            Provider provider = C2254l.crashlytics().getProvider();
            if (!AbstractC12589l.pro(1)) {
                C18262l.ads("Can not use ChaCha20Poly1305 in FIPS-mode.");
                return null;
            }
            if (bArr.length != 32) {
                C18073l.smaato("The key length in bytes must be 32.");
                return null;
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "ChaCha20");
            if (bArr3 == null) {
                C6541l.subs("plaintext is null");
                return null;
            }
            if (bArr2.length != 12) {
                C18262l.ads("nonce length must be 12 bytes.");
                return null;
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", provider);
            cipher.init(1, secretKeySpec, ivParameterSpec);
            if (bArr4.length != 0) {
                cipher.updateAAD(bArr4);
            }
            int outputSize = cipher.getOutputSize(bArr3.length);
            if (outputSize > Alert.DURATION_SHOW_INDEFINITELY - i) {
                C18262l.ads("plaintext too long");
                return null;
            }
            byte[] bArr5 = new byte[i + outputSize];
            if (cipher.doFinal(bArr3, 0, bArr3.length, bArr5, i) == outputSize) {
                return bArr5;
            }
            C18262l.ads("not enough data written");
            return null;
        } catch (GeneralSecurityException unused) {
            C10018l c10018l = new C10018l(bArr, 0);
            if (bArr3.length > 2147483631) {
                C18262l.ads("plaintext too long");
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr3.length + 16);
            c10018l.m4262l(byteBufferAllocate, bArr2, bArr3, bArr4);
            byte[] bArrArray = byteBufferAllocate.array();
            if (bArrArray.length > Alert.DURATION_SHOW_INDEFINITELY - i) {
                C18073l.pro("Plaintext too long");
                return null;
            }
            byte[] bArr6 = new byte[bArrArray.length + i];
            System.arraycopy(bArrArray, 0, bArr6, i, bArrArray.length);
            return bArr6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object pro(CachedTrack cachedTrack, boolean z, AbstractC0283l abstractC0283l) {
        C5054l c5054l;
        if (abstractC0283l instanceof C5054l) {
            c5054l = (C5054l) abstractC0283l;
            int i = c5054l.f10323l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5054l.f10323l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5054l = new C5054l(this, abstractC0283l);
            }
        } else {
            c5054l = new C5054l(this, abstractC0283l);
        }
        Object objM3168l = c5054l.f10326l;
        int i2 = c5054l.f10323l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM3168l);
            C6336l c6336l = C6336l.yandex;
            c5054l.f10325l = cachedTrack;
            c5054l.f10324l = z;
            c5054l.f10323l = 1;
            objM3168l = C6336l.loadAd.m3168l(c5054l);
            if (objM3168l != enumC9342l) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC2829l.crashlytics(objM3168l);
                return objM3168l;
            }
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = c5054l.f10324l;
        cachedTrack = c5054l.f10325l;
        AbstractC2829l.crashlytics(objM3168l);
        C9012l c9012l = new C9012l(cachedTrack, z, 0);
        c5054l.f10325l = null;
        c5054l.f10324l = z;
        c5054l.f10323l = 2;
        Object objM1734l = ((C5198l) objM3168l).m1734l(c9012l, c5054l);
        return objM1734l == enumC9342l ? enumC9342l : objM1734l;
    }

    @Override // defpackage.InterfaceC3881l
    public byte[] purchase(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length != 32) {
            C18073l.pro("Unexpected key length: 32");
            return null;
        }
        try {
            C2254l.crashlytics();
            Provider provider = C2254l.crashlytics().getProvider();
            if (!AbstractC12589l.pro(1)) {
                C18262l.ads("Can not use ChaCha20Poly1305 in FIPS-mode.");
                return null;
            }
            if (bArr.length != 32) {
                C18073l.smaato("The key length in bytes must be 32.");
                return null;
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "ChaCha20");
            if (bArr3 == null) {
                C6541l.subs("ciphertext is null");
                return null;
            }
            if (bArr2.length != 12) {
                C18262l.ads("nonce length must be 12 bytes.");
                return null;
            }
            if (bArr3.length < i + 16) {
                C18262l.ads("ciphertext too short");
                return null;
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", provider);
            cipher.init(2, secretKeySpec, ivParameterSpec);
            if (bArr4.length != 0) {
                cipher.updateAAD(bArr4);
            }
            return cipher.doFinal(bArr3, i, bArr3.length - i);
        } catch (GeneralSecurityException unused) {
            return new C10018l(bArr, 0).m4260l(ByteBuffer.wrap(Arrays.copyOfRange(bArr3, i, bArr3.length)), bArr2, bArr4);
        }
    }

    @Override // defpackage.InterfaceC3881l
    public int remoteconfig() {
        return 32;
    }

    @Override // defpackage.InterfaceC1953l
    public Object smaato(C3823l c3823l) {
        Intent intent = (Intent) ((Bundle) c3823l.isPro()).getParcelable("notification_data");
        if (intent != null) {
            return new C2220l(intent);
        }
        return null;
    }

    @Override // defpackage.InterfaceC3501l
    public void startapp(InterfaceC13490l interfaceC13490l, int i, int[] iArr, int[] iArr2) {
        AbstractC8313l.yandex(i, iArr, iArr2, false);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // defpackage.InterfaceC13540l
    /* JADX INFO: renamed from: throws */
    public Object mo805throws(AbstractC10022l abstractC10022l, AbstractC0283l abstractC0283l) {
        C3556l c3556l;
        InterfaceC13012l interfaceC13012lLoadAd;
        C12757l c12757l;
        InterfaceC13012l interfaceC13012lLoadAd2;
        C14156l c14156l;
        InterfaceC13012l interfaceC13012lLoadAd3;
        int i = this.f3671l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        switch (i) {
            case 13:
                if (abstractC0283l instanceof C3556l) {
                    c3556l = (C3556l) abstractC0283l;
                    int i2 = c3556l.f7475l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c3556l.f7475l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c3556l = new C3556l(this, abstractC0283l);
                    }
                } else {
                    c3556l = new C3556l(this, abstractC0283l);
                }
                Object objYandex = c3556l.f7476l;
                int i3 = c3556l.f7475l;
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
                    interfaceC13012lLoadAd = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(C10974l.class)));
                } catch (Throwable unused) {
                    interfaceC13012lLoadAd = null;
                }
                C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lLoadAd);
                c3556l.f7475l = 1;
                objYandex = c14249lLoadAd.yandex(c11310l, c3556l);
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
                if (abstractC0283l instanceof C12757l) {
                    c12757l = (C12757l) abstractC0283l;
                    int i4 = c12757l.f25132l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c12757l.f25132l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c12757l = new C12757l(this, abstractC0283l);
                    }
                } else {
                    c12757l = new C12757l(this, abstractC0283l);
                }
                Object objYandex2 = c12757l.f25133l;
                int i5 = c12757l.f25132l;
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
                    interfaceC13012lLoadAd2 = AbstractC18202l.loadAd(C0951l.class, AbstractC12953l.smaato(AbstractC18202l.yandex(Integer.TYPE)));
                } catch (Throwable unused2) {
                    interfaceC13012lLoadAd2 = null;
                }
                C11310l c11310l2 = new C11310l(interfaceC1388lLoadAd2, interfaceC13012lLoadAd2);
                c12757l.f25132l = 1;
                objYandex2 = c14249lLoadAd2.yandex(c11310l2, c12757l);
                if (objYandex2 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex2 != null) {
                    return (C0951l) objYandex2;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
            default:
                if (abstractC0283l instanceof C14156l) {
                    c14156l = (C14156l) abstractC0283l;
                    int i6 = c14156l.f27681l;
                    if ((i6 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c14156l.f27681l = i6 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c14156l = new C14156l(this, abstractC0283l);
                    }
                } else {
                    c14156l = new C14156l(this, abstractC0283l);
                }
                Object objYandex3 = c14156l.f27682l;
                int i7 = c14156l.f27681l;
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
                c14156l.f27681l = 1;
                objYandex3 = c14249lLoadAd3.yandex(c11310l3, c14156l);
                if (objYandex3 == enumC9342l) {
                    return enumC9342l;
                }
                break;
                if (objYandex3 != null) {
                    return (C0951l) objYandex3;
                }
                C6541l.subs("null cannot be cast to non-null type bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse<T>");
                return null;
        }
    }

    public String toString() {
        switch (this.f3671l) {
            case 9:
                return "ReferentialEqualityPolicy";
            case 16:
                return "[]";
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return "Arrangement#Center";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC1541l
    public Object vip(Function1 function1) {
        return new C10541l(function1);
    }

    @Override // defpackage.InterfaceC1541l
    public void yandex(C16864l c16864l, Object obj) {
        c16864l.f32922l.firebase(C8403l.f17380l, new C13749l((C10541l) obj, (InterfaceC14029l) null, 3));
    }

    @Override // defpackage.InterfaceC6128l
    public void subs() {
    }

    @Override // defpackage.InterfaceC6128l
    public void metrica(AbstractC0958l abstractC0958l) {
    }

    @Override // defpackage.InterfaceC6128l
    public void isPro(int i, AbstractC0958l abstractC0958l, C2667l c2667l) {
    }
}
