package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.audiofx.AudioEffect;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.compat.quirk.UseTorchAsFlashQuirk;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_binary_t;
import io.realm.kotlin.internal.interop.realm_decimal128_t;
import io.realm.kotlin.internal.interop.realm_object_id_t;
import io.realm.kotlin.internal.interop.realm_uuid_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.mongodb.kbson.BsonObjectId$Companion;

/* JADX INFO: renamed from: lٗٙۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C17219l implements InterfaceC6152l, InterfaceC9576l, InterfaceC17475l, InterfaceC2232l, InterfaceC13504l, InterfaceC2435l, InterfaceC12202l, InterfaceC9526l {

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static C17219l f33422l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f33423l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f33424l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33425l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object f33426l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f33427l;

    public C17219l(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        this.f33425l = 12;
        C16650l c16650l = new C16650l(this);
        this.f33423l = c16650l;
        if (!AbstractC12589l.ad(2)) {
            C18262l.ads("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        this.f33427l = str;
        this.f33426l = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            C18073l.pro("key size too small, need at least 16 bytes");
            throw null;
        }
        switch (str) {
            case "HMACSHA1":
                this.f33424l = 20;
                break;
            case "HMACSHA224":
                this.f33424l = 28;
                break;
            case "HMACSHA256":
                this.f33424l = 32;
                break;
            case "HMACSHA384":
                this.f33424l = 48;
                break;
            case "HMACSHA512":
                this.f33424l = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        c16650l.get();
    }

    /* JADX INFO: renamed from: new, reason: not valid java name */
    public static synchronized C17219l m4278new(Context context) {
        try {
            if (f33422l == null) {
                f33422l = new C17219l(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC6995l("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f33422l;
    }

    public static void subs(int i, byte[] bArr) {
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
    }

    @Override // defpackage.InterfaceC2435l
    public boolean Signature(Object obj, int i, Map map) {
        C3585l c3585l = new C3585l(16);
        boolean zBooleanValue = ((Boolean) AbstractC16417l.loadAd(c3585l, (InterfaceC3327l) obj, new C17330l(3, this), new C0237l(this, i, map, c3585l), new C9673l(23), new C9673l(24))).booleanValue();
        c3585l.tapsense();
        return zBooleanValue;
    }

    @Override // defpackage.InterfaceC2435l
    public int admob() {
        return this.f33424l;
    }

    public boolean advert() {
        C16328l c16328l = (C16328l) this.f33423l;
        C17893l c17893l = (C17893l) this.f33426l;
        int i = this.f33424l - 1;
        this.f33424l = i;
        if (i == 0 && c17893l.f34846l != 0) {
            C10178l c10178l = c16328l.yandex;
            InterfaceC13142l interfaceC13142l = c16328l.loadAd;
            c10178l.loadAd.yandex().premium();
            C2566l c2566l = c10178l.loadAd;
            if (c16328l.crashlytics == null) {
                this.f33427l = c2566l;
            }
            Object[] objArr = c17893l.f34848l;
            int i2 = c17893l.f34846l;
            for (int i3 = 0; i3 < i2; i3++) {
                ((Function1) objArr[i3]).invoke(c2566l);
            }
            c16328l.smaato(c2566l);
            C10178l.yandex(c10178l, interfaceC13142l, false, 1);
            c10178l.amazon(true);
            c17893l.isPro();
        }
        return this.f33424l > 0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0046  */
    @Override // defpackage.InterfaceC12202l
    public void amazon(Object obj) {
        C3557l c3557l;
        C4039l c4039l = (C4039l) this.f33423l;
        String str = (String) this.f33427l;
        int i = this.f33424l;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f33426l;
        Bundle bundle = (Bundle) obj;
        C17667l c17667l = c4039l.yandex;
        AbstractC1051l.subs(c17667l);
        C8181l c8181l = c4039l.loadAd;
        int i2 = 3;
        if (i == 3) {
            BinderC11031l binderC11031l = c4039l.crashlytics;
            c3557l = new C3557l();
            c3557l.f7480l = c4039l;
            c3557l.f7479l = binderC11031l;
            c3557l.f7478l = str;
            c3557l.f7481l = new C7214l(c3557l);
            c17667l.yandex(new C5321l(c3557l));
            if (c8181l != null) {
                C16880l c16880l = new C16880l(1, c3557l);
                C8181l.mopub.loadAd("register callback = %s", c16880l);
                AbstractC1051l.purchase("Must be called from the main thread.");
                c8181l.loadAd.add(c16880l);
            }
        } else if (i == 2) {
            i = 2;
            BinderC11031l binderC11031l2 = c4039l.crashlytics;
            c3557l = new C3557l();
            c3557l.f7480l = c4039l;
            c3557l.f7479l = binderC11031l2;
            c3557l.f7478l = str;
            c3557l.f7481l = new C7214l(c3557l);
            c17667l.yandex(new C5321l(c3557l));
            if (c8181l != null) {
                C16880l c16880l2 = new C16880l(1, c3557l);
                C8181l.mopub.loadAd("register callback = %s", c16880l2);
                AbstractC1051l.purchase("Must be called from the main thread.");
                c8181l.loadAd.add(c16880l2);
            }
        }
        if (i == 1 || i == 2) {
            C9670l c9670l = new C9670l(sharedPreferences, c4039l, c4039l.crashlytics, bundle, str);
            c17667l.yandex(new C11262l(i2, c9670l));
            if (c8181l != null) {
                C16880l c16880l3 = new C16880l(0, c9670l);
                C8181l.mopub.loadAd("register callback = %s", c16880l3);
                AbstractC1051l.purchase("Must be called from the main thread.");
                c8181l.loadAd.add(c16880l3);
            }
        }
    }

    @Override // defpackage.InterfaceC6152l
    public void billing(InterfaceC16937l interfaceC16937l) {
        if (!(interfaceC16937l instanceof C9800l)) {
            C8339l.metrica("KDF parameters required for generator");
            return;
        }
        C9800l c9800l = (C9800l) interfaceC16937l;
        this.f33427l = c9800l.loadAd;
        this.f33426l = c9800l.yandex;
    }

    @Override // defpackage.InterfaceC9526l
    public /* synthetic */ ListenableFuture call() {
        C3013l c3013l = (C3013l) this.f33423l;
        AbstractC12570l abstractC12570l = (AbstractC12570l) this.f33427l;
        int i = this.f33424l;
        ArrayList arrayList = (ArrayList) this.f33426l;
        ListenableFuture listenableFuturePurchase = AbstractC7151l.purchase(abstractC12570l);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) AbstractC7151l.crashlytics((Future) arrayList.get(i2))).booleanValue()) {
                if (((List) c3013l.loadAd).get(i2) != null) {
                    C18725l.loadAd();
                    return null;
                }
                listenableFuturePurchase = AbstractC7151l.admob(listenableFuturePurchase, AbstractC6854l.loadAd(new C13368l(1)), EnumC1535l.f3808l);
            }
        }
        return listenableFuturePurchase;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public long m4279case(long j) {
        C16328l c16328l = (C16328l) this.f33423l;
        return c16328l.crashlytics != null ? c16328l.purchase(j) : j;
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public int m4280catch() {
        C2566l c2566l = (C2566l) this.f33427l;
        return c2566l != null ? c2566l.f5577l.length() : ((C16328l) this.f33423l).amazon().f12057l.length();
    }

    /* JADX INFO: renamed from: class, reason: not valid java name */
    public void m4281class() {
        HandlerThread handlerThread;
        synchronized (this.f33423l) {
            try {
                AbstractC12442l.subscription(this.f33424l > 0);
                int i = this.f33424l - 1;
                this.f33424l = i;
                if (i == 0 && (handlerThread = (HandlerThread) this.f33426l) != null) {
                    handlerThread.quit();
                    this.f33426l = null;
                    this.f33427l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC2435l
    public void clear() {
        AbstractC0653l.crashlytics(this);
    }

    @Override // defpackage.InterfaceC2435l
    public boolean contains(Object obj) {
        realm_value_t realm_value_tVarInmobi;
        InterfaceC3327l interfaceC3327l = (InterfaceC3327l) obj;
        C11140l c11140l = C11140l.f22375l;
        if ((interfaceC3327l != null ? ((C14076l) interfaceC3327l).yandex : 0) == 11) {
            if (!AbstractC15011l.subs(((C14076l) interfaceC3327l).subs(AbstractC18202l.yandex.loadAd(InterfaceC2851l.class)))) {
                return false;
            }
        }
        C3585l c3585l = new C3585l(16);
        if (interfaceC3327l != null) {
            C14076l c14076l = (C14076l) interfaceC3327l;
            int i = c14076l.yandex;
            switch (AbstractC5020l.inmobi(i)) {
                case 10:
                    InterfaceC9671l interfaceC9671lSubs = c14076l.subs(AbstractC18202l.yandex.loadAd(InterfaceC9671l.class));
                    C1332l c1332l = null;
                    if (interfaceC9671lSubs != null) {
                        C1332l f36736l = ((InterfaceC2851l) interfaceC9671lSubs).getF36799l();
                        c1332l = f36736l != null ? f36736l : null;
                        if (c1332l == null) {
                            C8339l.metrica("Cannot lookup unmanaged objects in realm");
                            return false;
                        }
                    }
                    realm_value_tVarInmobi = c3585l.inmobi(c1332l);
                    break;
                case 11:
                case 12:
                    C8339l.metrica("Cannot pass unmanaged collections as input argument");
                    return false;
                default:
                    switch (AbstractC5020l.inmobi(i)) {
                        case 0:
                            realm_value_tVarInmobi = c3585l.isVip(Long.valueOf(c14076l.billing()));
                            break;
                        case 1:
                            realm_value_tVarInmobi = c3585l.isPro(Boolean.valueOf(c14076l.yandex()));
                            break;
                        case 2:
                            realm_value_tVarInmobi = c3585l.m1360volatile(c14076l.firebase());
                            break;
                        case 3:
                            realm_value_tVarInmobi = c3585l.firebase(c14076l.loadAd());
                            break;
                        case 4:
                            realm_value_tVarInmobi = c3585l.m1356native((C15729l) c14076l.admob());
                            break;
                        case 5:
                            realm_value_tVarInmobi = c3585l.subscription(Float.valueOf(c14076l.purchase()));
                            break;
                        case 6:
                            realm_value_tVarInmobi = c3585l.startapp(Double.valueOf(c14076l.amazon()));
                            break;
                        case 7:
                            realm_value_tVarInmobi = c3585l.remoteconfig(c14076l.crashlytics());
                            break;
                        case 8:
                            realm_value_tVarInmobi = c11140l.metrica(c14076l.mopub().mopub());
                            break;
                        case 9:
                            realm_value_tVarInmobi = c11140l.ads(((C4695l) c14076l.isPro()).yandex);
                            break;
                        default:
                            C10754l.ads("If you want to convert a 'RealmAny' instance containing an object to a 'RealmValue' use 'realmAnyToRealmValue' (when working with 'RealmQuery') or 'realmAnyToRealmValueWithObjectImport' (when using an accessor).");
                            return false;
                    }
                    break;
            }
        } else {
            realm_value_tVarInmobi = c3585l.signatures();
        }
        realm_value_t realm_value_tVar = realm_value_tVarInmobi;
        boolean[] zArr = new boolean[1];
        long ptr$cinterop_release = ((LongPointerWrapper) this.f33426l).getPtr$cinterop_release();
        int i2 = AbstractC9795l.yandex;
        realmcJNI.realm_set_find(ptr$cinterop_release, realm_value_tVar.yandex, realm_value_tVar, new long[1], zArr);
        boolean z = zArr[0];
        c3585l.tapsense();
        return z;
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public Looper m4282continue() {
        Looper looper;
        synchronized (this.f33423l) {
            try {
                if (((Looper) this.f33427l) == null) {
                    AbstractC12442l.subscription(this.f33424l == 0 && ((HandlerThread) this.f33426l) == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f33426l = handlerThread;
                    handlerThread.start();
                    this.f33427l = ((HandlerThread) this.f33426l).getLooper();
                }
                this.f33424l++;
                looper = (Looper) this.f33427l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    @Override // defpackage.InterfaceC2435l
    public void crashlytics(int i) {
        this.f33424l = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public Object m4283default(InterfaceC11209l interfaceC11209l, int i, C3597l c3597l, AbstractC0283l abstractC0283l) {
        C0191l c0191l;
        Object c18435l;
        if (abstractC0283l instanceof C0191l) {
            c0191l = (C0191l) abstractC0283l;
            int i2 = c0191l.f1136l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0191l.f1136l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0191l = new C0191l(this, abstractC0283l);
            }
        } else {
            c0191l = new C0191l(this, abstractC0283l);
        }
        Object obj = c0191l.f1135l;
        int i3 = c0191l.f1136l;
        try {
            if (i3 == 0) {
                AbstractC2829l.crashlytics(obj);
                try {
                    interfaceC11209l.yandex(i, c3597l);
                    c18435l = Unit.INSTANCE;
                } catch (Throwable th) {
                    c18435l = new C18435l(th);
                }
                Throwable thYandex = C1171l.yandex(c18435l);
                if (thYandex != null) {
                    thYandex.printStackTrace();
                    c0191l.f1138l = interfaceC11209l;
                    c0191l.f1137l = c3597l;
                    c0191l.f1140l = c18435l;
                    c0191l.f1134l = i;
                    c0191l.f1136l = 1;
                    Object objPurchase = AbstractC8532l.purchase(100L, c0191l);
                    EnumC9342l enumC9342l = EnumC9342l.f19165l;
                    if (objPurchase == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = c0191l.f1134l;
            c3597l = c0191l.f1137l;
            interfaceC11209l = c0191l.f1138l;
            AbstractC2829l.crashlytics(obj);
            interfaceC11209l.yandex(i, c3597l);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC2232l
    public int doFinal(byte[] bArr, int i) {
        int i2 = this.f33424l;
        byte[] bArr2 = new byte[i2];
        AbstractC1821l abstractC1821l = (AbstractC1821l) this.f33423l;
        abstractC1821l.doFinal(bArr2, 0);
        byte[] bArr3 = (byte[]) this.f33426l;
        abstractC1821l.update(bArr3, 0, bArr3.length);
        abstractC1821l.update(bArr2, 0, i2);
        int iDoFinal = abstractC1821l.doFinal(bArr, 0);
        reset();
        return iDoFinal;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public boolean m4284else() {
        boolean zIsEmpty;
        synchronized (this.f33427l) {
            zIsEmpty = ((ArrayDeque) this.f33423l).isEmpty();
        }
        return zIsEmpty;
    }

    /* JADX INFO: renamed from: final, reason: not valid java name */
    public void m4285final(char[] cArr, int i) throws IOException {
        byte[] bArr = (byte[]) this.f33427l;
        if (i < 0) {
            C8339l.metrica("count < 0");
            return;
        }
        if (i > cArr.length) {
            C10754l.remoteconfig(cArr.length, AbstractC2812l.Signature("count > string.length: ", i, " > "));
            return;
        }
        int i2 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            if (c < 128) {
                if (bArr.length - this.f33424l < 1) {
                    signatures();
                }
                int i3 = this.f33424l;
                int i4 = i3 + 1;
                this.f33424l = i4;
                bArr[i3] = (byte) c;
                i2++;
                int iMin = Math.min(i, (bArr.length - i4) + i2);
                while (i2 < iMin) {
                    char c2 = cArr[i2];
                    if (c2 >= 128) {
                        break;
                    }
                    int i5 = this.f33424l;
                    this.f33424l = i5 + 1;
                    bArr[i5] = (byte) c2;
                    i2++;
                }
            } else {
                if (c < 2048) {
                    if (bArr.length - this.f33424l < 2) {
                        signatures();
                    }
                    int i6 = this.f33424l;
                    int i7 = i6 + 1;
                    this.f33424l = i7;
                    bArr[i6] = (byte) ((c >> 6) | 192);
                    this.f33424l = i6 + 2;
                    bArr[i7] = (byte) ((c & '?') | 128);
                } else if (c < 55296 || c > 57343) {
                    if (bArr.length - this.f33424l < 3) {
                        signatures();
                    }
                    int i8 = this.f33424l;
                    int i9 = i8 + 1;
                    this.f33424l = i9;
                    bArr[i8] = (byte) ((c >> '\f') | 224);
                    int i10 = i8 + 2;
                    this.f33424l = i10;
                    bArr[i9] = (byte) (((c >> 6) & 63) | 128);
                    this.f33424l = i8 + 3;
                    bArr[i10] = (byte) ((c & '?') | 128);
                } else {
                    int i11 = i2 + 1;
                    char c3 = i11 < i ? cArr[i11] : (char) 0;
                    if (c > 56319 || 56320 > c3 || c3 >= 57344) {
                        if (bArr.length - this.f33424l < 1) {
                            signatures();
                        }
                        int i12 = this.f33424l;
                        this.f33424l = i12 + 1;
                        bArr[i12] = 63;
                        i2 = i11;
                    } else {
                        int i13 = (((c & 1023) << 10) | (c3 & 1023)) + 65536;
                        if (bArr.length - this.f33424l < 4) {
                            signatures();
                        }
                        int i14 = this.f33424l;
                        int i15 = i14 + 1;
                        this.f33424l = i15;
                        bArr[i14] = (byte) ((i13 >> 18) | 240);
                        int i16 = i14 + 2;
                        this.f33424l = i16;
                        bArr[i15] = (byte) (((i13 >> 12) & 63) | 128);
                        int i17 = i14 + 3;
                        this.f33424l = i17;
                        bArr[i16] = (byte) (((i13 >> 6) & 63) | 128);
                        this.f33424l = i14 + 4;
                        bArr[i17] = (byte) ((i13 & 63) | 128);
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    @Override // defpackage.InterfaceC2435l
    public boolean firebase(C15525l c15525l, int i, Map map) {
        return AbstractC0653l.yandex(this, c15525l, i, map);
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public int m4286for() {
        int i = this.f33424l;
        if (i == 2) {
            return 2048;
        }
        if (i != 3) {
            return 0;
        }
        return AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        C9377l c9377l = (C9377l) this.f33423l;
        C5670l c5670l = (C5670l) this.f33426l;
        C13416l c13416l = (C13416l) this.f33427l;
        int i = this.f33424l;
        switch (i) {
            case 0:
                C16047l c16047l = (C16047l) c5670l.loadAd.get();
                C14338l c14338l = (C14338l) c13416l.isPro.get();
                if (c5670l.crashlytics.get() == null) {
                    return new C1130l(c16047l, c14338l, (InterfaceC16983l) c5670l.smaato.get(), c5670l.isPro, c5670l.subs, c5670l.admob);
                }
                C18725l.loadAd();
                return null;
            case 1:
                C16685l c16685l = c5670l.yandex;
                C7647l c7647l = (C7647l) c13416l.ad.get();
                c16685l.getClass();
                if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "Prepared UseCaseGraphContext (Deferred)");
                }
                return new C16047l(new C9917l(c16685l, 0), c7647l, c16685l.loadAd, new C9917l(c16685l, 1));
            case 2:
                c5670l.yandex.getClass();
                return null;
            case 3:
                return new C14358l(c5670l.firebase, (C14338l) c13416l.isPro.get());
            case 4:
                return new C6267l(c5670l.admob, c5670l.purchase, (C16047l) c5670l.loadAd.get(), c5670l.isPro, (C14338l) c13416l.isPro.get(), (C1276l) c9377l.yandex.f3606l);
            case 5:
                return C18002l.crashlytics ? (InterfaceC17552l) c5670l.mopub.get() : (InterfaceC17552l) c5670l.billing.get();
            case 6:
                C13224l c13224l = (C13224l) c5670l.amazon.get();
                C15158l c15158l = (C15158l) c13416l.adcel.get();
                C8715l c8715l = (C8715l) c13416l.startapp.get();
                C16656l c16656l = (C16656l) c13416l.tapsense.get();
                C14338l c14338l2 = (C14338l) c13416l.isPro.get();
                C5342l c5342l = (C5342l) c13416l.smaato.get();
                C5849l c5849l = (C5849l) c13416l.subs.get();
                return new C3607l(c13224l, c15158l, c8715l, c16656l, c14338l2, c5342l, c5849l.yandex().yandex(UseTorchAsFlashQuirk.class) ? new C3316l(c5849l, c13416l.loadAd.yandex(), (C5247l) c13416l.appmetrica.get()) : C6168l.f12995l, (C15736l) c13416l.amazon.get(), c5670l.purchase, (C16047l) c5670l.loadAd.get());
            case 7:
                C15736l c15736l = (C15736l) c13416l.amazon.get();
                c13416l.yandex();
                C13224l c13224l2 = new C13224l();
                C11905l c11905l = InterfaceC5389l.admob;
                InterfaceC5389l interfaceC5389l = c15736l.loadAd;
                c11905l.getClass();
                C11905l.loadAd(interfaceC5389l);
                return c13224l2;
            case 8:
                return new C2748l((C16047l) c5670l.loadAd.get(), c13416l.yandex());
            case 9:
                return new C18002l((C15736l) c13416l.amazon.get(), c5670l.billing, (C14338l) c13416l.isPro.get(), (C8715l) c13416l.startapp.get());
            case 10:
                C14338l c14338l3 = (C14338l) c13416l.isPro.get();
                C4723l c4723l = (C4723l) c9377l.yandex.f3601l;
                AbstractC17943l.yandex(c4723l);
                C17735l c17735lYandex = ((C5849l) c13416l.subs.get()).yandex();
                return new C4271l(c14338l3, c4723l, (c17735lYandex.yandex(ConfigureSurfaceToSecondarySessionFailQuirk.class) || c17735lYandex.yandex(PreviewOrientationIncorrectQuirk.class) || c17735lYandex.yandex(TextureViewIsClosedQuirk.class)) ? new C18595l(29) : C1461l.f3651l, (C9395l) c5670l.subs.get());
            case 11:
                return c5670l.yandex.crashlytics;
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.InterfaceC2232l
    public String getAlgorithmName() {
        return ((AbstractC1821l) this.f33423l).getAlgorithmName() + "/HMAC";
    }

    @Override // defpackage.InterfaceC2232l
    public int getMacSize() {
        return this.f33424l;
    }

    /* JADX INFO: renamed from: goto, reason: not valid java name */
    public synchronized C3823l m4287goto(C7075l c7075l) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(c7075l.toString()));
            }
            if (!((ServiceConnectionC16475l) this.f33426l).amazon(c7075l)) {
                ServiceConnectionC16475l serviceConnectionC16475l = new ServiceConnectionC16475l(this);
                this.f33426l = serviceConnectionC16475l;
                serviceConnectionC16475l.amazon(c7075l);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c7075l.loadAd.yandex;
    }

    @Override // defpackage.InterfaceC2232l
    public void init(InterfaceC9719l interfaceC9719l) {
        byte[] bArr = (byte[]) this.f33427l;
        AbstractC1821l abstractC1821l = (AbstractC1821l) this.f33423l;
        abstractC1821l.reset();
        byte[] bArr2 = ((C13886l) interfaceC9719l).f27156l;
        if (bArr2.length > 64) {
            abstractC1821l.update(bArr2, 0, bArr2.length);
            abstractC1821l.doFinal(bArr, 0);
            for (int i = this.f33424l; i < bArr.length; i++) {
                bArr[i] = 0;
            }
        } else {
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            for (int length = bArr2.length; length < bArr.length; length++) {
                bArr[length] = 0;
            }
        }
        byte[] bArr3 = new byte[bArr.length];
        this.f33426l = bArr3;
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ 54);
        }
        int i3 = 0;
        while (true) {
            byte[] bArr4 = (byte[]) this.f33426l;
            if (i3 >= bArr4.length) {
                abstractC1821l.update(bArr, 0, bArr.length);
                return;
            } else {
                bArr4[i3] = (byte) (bArr4[i3] ^ 92);
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public void m4288interface() {
        int i = this.f33424l * 2;
        this.f33427l = Arrays.copyOf((Object[]) this.f33427l, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        AbstractC8669l.premium(0, 0, (int[]) this.f33426l, iArr, 14);
        this.f33426l = iArr;
    }

    public void isVip(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.f33426l;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.f33426l = Arrays.copyOf(cArr, i3);
        }
    }

    public Object license() {
        Object objRemoveLast;
        synchronized (this.f33427l) {
            objRemoveLast = ((ArrayDeque) this.f33423l).removeLast();
        }
        return objRemoveLast;
    }

    @Override // defpackage.InterfaceC2435l
    public InterfaceC2435l loadAd(InterfaceC7832l interfaceC7832l, LongPointerWrapper longPointerWrapper) {
        return new C17219l((C5501l) this.f33423l, interfaceC7832l, longPointerWrapper);
    }

    @Override // defpackage.InterfaceC2435l
    /* JADX INFO: renamed from: package */
    public boolean mo1139package(Object obj, int i, LinkedHashMap linkedHashMap) {
        boolean zSignature = Signature((InterfaceC3327l) obj, i, linkedHashMap);
        crashlytics(admob() + 1);
        return zSignature;
    }

    @Override // defpackage.InterfaceC17475l
    public void premium(char c) throws IOException {
        byte[] bArr = (byte[]) this.f33427l;
        if (c < 128) {
            if (bArr.length - this.f33424l < 1) {
                signatures();
            }
            int i = this.f33424l;
            this.f33424l = i + 1;
            bArr[i] = (byte) c;
            return;
        }
        if (c < 2048) {
            if (bArr.length - this.f33424l < 2) {
                signatures();
            }
            int i2 = this.f33424l;
            int i3 = i2 + 1;
            this.f33424l = i3;
            bArr[i2] = (byte) ((c >> 6) | 192);
            this.f33424l = i2 + 2;
            bArr[i3] = (byte) ((c & '?') | 128);
            return;
        }
        if (55296 <= c && c < 57344) {
            if (bArr.length - this.f33424l < 1) {
                signatures();
            }
            int i4 = this.f33424l;
            this.f33424l = i4 + 1;
            bArr[i4] = 63;
            return;
        }
        if (c < 0) {
            if (bArr.length - this.f33424l < 3) {
                signatures();
            }
            int i5 = this.f33424l;
            int i6 = i5 + 1;
            this.f33424l = i6;
            bArr[i5] = -32;
            int i7 = i5 + 2;
            this.f33424l = i7;
            bArr[i6] = (byte) (((c >> 6) & 63) | 128);
            this.f33424l = i5 + 3;
            bArr[i7] = (byte) ((c & '?') | 128);
            return;
        }
        if (c > 65535) {
            throw new C16768l(AbstractC15560l.tapsense("Unexpected code point: ", c, ". Check your strings for malformed UTF-8 sequences."), 6, null);
        }
        if (bArr.length - this.f33424l < 4) {
            signatures();
        }
        int i8 = this.f33424l;
        int i9 = i8 + 1;
        this.f33424l = i9;
        bArr[i8] = -16;
        int i10 = i8 + 2;
        this.f33424l = i10;
        bArr[i9] = -128;
        int i11 = i8 + 3;
        this.f33424l = i11;
        bArr[i10] = (byte) (((c >> 6) & 63) | 128);
        this.f33424l = i8 + 4;
        bArr[i11] = (byte) ((c & '?') | 128);
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public String m4289private() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f33424l + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = ((Object[]) this.f33427l)[i2];
            if (obj instanceof InterfaceC18035l) {
                InterfaceC18035l interfaceC18035l = (InterfaceC18035l) obj;
                boolean zYandex = AbstractC8576l.yandex(interfaceC18035l.billing(), C9164l.amazon);
                int[] iArr = (int[]) this.f33426l;
                if (!zYandex) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(interfaceC18035l.admob(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f33426l)[i2]);
                    sb.append("]");
                }
            } else if (obj == C15718l.f30865l) {
                sb.append("[<debug info disabled>]");
            } else if (obj != C6168l.f12988l) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public void pro(C9185l c9185l, boolean z) {
        C13408l c13408l = (C13408l) this.f33426l;
        List list = c9185l.yandex;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C15730l) list.get(i)).crashlytics()) {
                m4290static(c9185l);
                return;
            }
        }
        InterfaceC18212l interfaceC18212l = (InterfaceC18212l) this.f33423l;
        if (interfaceC18212l == null) {
            C8339l.smaato("layoutCoordinates not set");
            return;
        }
        AbstractC1163l.admob(c9185l, interfaceC18212l.mo2591strictfp(0L), new C2977l(this, c13408l, 11), false);
        if (this.f33424l == 2) {
            if (z) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C15730l) list.get(i2)).yandex();
                }
            }
            C8634l c8634l = c9185l.loadAd;
            if (c8634l != null) {
                c8634l.f17793l = !c13408l.f26309l;
            }
        }
    }

    @Override // defpackage.InterfaceC6152l
    public int purchase(int i, byte[] bArr) {
        int i2;
        int i3 = this.f33424l;
        InterfaceC16922l interfaceC16922l = (InterfaceC16922l) this.f33423l;
        if (i <= 0) {
            C8339l.metrica("len must be > 0");
            return 0;
        }
        if (bArr.length - i < 0) {
            C18073l.ad("output buffer too small");
            return 0;
        }
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[4];
        interfaceC16922l.reset();
        int i4 = 1;
        int i5 = 0;
        if (i > i3) {
            while (true) {
                subs(i4, bArr3);
                interfaceC16922l.update(bArr3, 0, 4);
                byte[] bArr4 = (byte[]) this.f33427l;
                interfaceC16922l.update(bArr4, 0, bArr4.length);
                byte[] bArr5 = (byte[]) this.f33426l;
                interfaceC16922l.update(bArr5, 0, bArr5.length);
                interfaceC16922l.doFinal(bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i5, i3);
                i5 += i3;
                i2 = i4 + 1;
                if (i4 >= i / i3) {
                    break;
                }
                i4 = i2;
            }
            i4 = i2;
        }
        if (i5 < i) {
            subs(i4, bArr3);
            interfaceC16922l.update(bArr3, 0, 4);
            byte[] bArr6 = (byte[]) this.f33427l;
            interfaceC16922l.update(bArr6, 0, bArr6.length);
            byte[] bArr7 = (byte[]) this.f33426l;
            interfaceC16922l.update(bArr7, 0, bArr7.length);
            interfaceC16922l.doFinal(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i5, i - i5);
        }
        return i;
    }

    @Override // defpackage.InterfaceC10984l
    public InterfaceC7832l remoteconfig() {
        return (InterfaceC7832l) this.f33427l;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Code duplicated, block: B:24:0x0085  */
    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:26:0x009d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ec  */
    @Override // defpackage.InterfaceC2435l
    public boolean remove(Object obj) {
        C3585l c3585l;
        C14076l c14076l;
        int i;
        InterfaceC9671l interfaceC9671lSubs;
        C1332l c1332l;
        realm_value_t realm_value_tVarInmobi;
        InterfaceC3327l interfaceC3327l = (InterfaceC3327l) obj;
        C11140l c11140l = C11140l.f22375l;
        boolean z = false;
        if ((interfaceC3327l != null ? ((C14076l) interfaceC3327l).yandex : 0) == 11) {
            if (AbstractC15011l.subs(((C14076l) interfaceC3327l).subs(AbstractC18202l.yandex.loadAd(InterfaceC2851l.class)))) {
                c3585l = new C3585l(16);
                if (interfaceC3327l == null) {
                    c14076l = (C14076l) interfaceC3327l;
                    i = c14076l.yandex;
                    switch (AbstractC5020l.inmobi(i)) {
                        case 10:
                            interfaceC9671lSubs = c14076l.subs(AbstractC18202l.yandex.loadAd(InterfaceC9671l.class));
                            c1332l = null;
                            if (interfaceC9671lSubs != null) {
                                C1332l f36736l = ((InterfaceC2851l) interfaceC9671lSubs).getF36799l();
                                c1332l = f36736l != null ? f36736l : null;
                                if (c1332l != null) {
                                    C8339l.metrica("Cannot lookup unmanaged objects in realm");
                                    break;
                                }
                            }
                            realm_value_tVarInmobi = c3585l.inmobi(c1332l);
                            break;
                        case 11:
                        case 12:
                            C8339l.metrica("Cannot pass unmanaged collections as input argument");
                            break;
                        default:
                            switch (AbstractC5020l.inmobi(i)) {
                                case 0:
                                    realm_value_tVarInmobi = c3585l.isVip(Long.valueOf(c14076l.billing()));
                                    break;
                                case 1:
                                    realm_value_tVarInmobi = c3585l.isPro(Boolean.valueOf(c14076l.yandex()));
                                    break;
                                case 2:
                                    realm_value_tVarInmobi = c3585l.m1360volatile(c14076l.firebase());
                                    break;
                                case 3:
                                    realm_value_tVarInmobi = c3585l.firebase(c14076l.loadAd());
                                    break;
                                case 4:
                                    realm_value_tVarInmobi = c3585l.m1356native((C15729l) c14076l.admob());
                                    break;
                                case 5:
                                    realm_value_tVarInmobi = c3585l.subscription(Float.valueOf(c14076l.purchase()));
                                    break;
                                case 6:
                                    realm_value_tVarInmobi = c3585l.startapp(Double.valueOf(c14076l.amazon()));
                                    break;
                                case 7:
                                    realm_value_tVarInmobi = c3585l.remoteconfig(c14076l.crashlytics());
                                    break;
                                case 8:
                                    realm_value_tVarInmobi = c11140l.metrica(c14076l.mopub().mopub());
                                    break;
                                case 9:
                                    realm_value_tVarInmobi = c11140l.ads(((C4695l) c14076l.isPro()).yandex);
                                    break;
                                default:
                                    C10754l.ads("If you want to convert a 'RealmAny' instance containing an object to a 'RealmValue' use 'realmAnyToRealmValue' (when working with 'RealmQuery') or 'realmAnyToRealmValueWithObjectImport' (when using an accessor).");
                                    break;
                            }
                            break;
                    }
                } else {
                    realm_value_tVarInmobi = c3585l.signatures();
                }
                realm_value_t realm_value_tVar = realm_value_tVarInmobi;
                boolean[] zArr = new boolean[1];
                long ptr$cinterop_release = ((LongPointerWrapper) this.f33426l).getPtr$cinterop_release();
                int i2 = AbstractC9795l.yandex;
                realmcJNI.realm_set_erase(ptr$cinterop_release, realm_value_tVar.yandex, realm_value_tVar, zArr);
                z = zArr[0];
                c3585l.tapsense();
            }
        } else {
            c3585l = new C3585l(16);
            if (interfaceC3327l == null) {
                c14076l = (C14076l) interfaceC3327l;
                i = c14076l.yandex;
                switch (AbstractC5020l.inmobi(i)) {
                    case 10:
                        interfaceC9671lSubs = c14076l.subs(AbstractC18202l.yandex.loadAd(InterfaceC9671l.class));
                        c1332l = null;
                        if (interfaceC9671lSubs != null) {
                            C1332l f36736l2 = ((InterfaceC2851l) interfaceC9671lSubs).getF36799l();
                            if (f36736l2 != null) {
                            }
                            if (c1332l != null) {
                                C8339l.metrica("Cannot lookup unmanaged objects in realm");
                                break;
                            }
                        }
                        realm_value_tVarInmobi = c3585l.inmobi(c1332l);
                        break;
                    case 11:
                    case 12:
                        C8339l.metrica("Cannot pass unmanaged collections as input argument");
                        break;
                    default:
                        switch (AbstractC5020l.inmobi(i)) {
                            case 0:
                                realm_value_tVarInmobi = c3585l.isVip(Long.valueOf(c14076l.billing()));
                                break;
                            case 1:
                                realm_value_tVarInmobi = c3585l.isPro(Boolean.valueOf(c14076l.yandex()));
                                break;
                            case 2:
                                realm_value_tVarInmobi = c3585l.m1360volatile(c14076l.firebase());
                                break;
                            case 3:
                                realm_value_tVarInmobi = c3585l.firebase(c14076l.loadAd());
                                break;
                            case 4:
                                realm_value_tVarInmobi = c3585l.m1356native((C15729l) c14076l.admob());
                                break;
                            case 5:
                                realm_value_tVarInmobi = c3585l.subscription(Float.valueOf(c14076l.purchase()));
                                break;
                            case 6:
                                realm_value_tVarInmobi = c3585l.startapp(Double.valueOf(c14076l.amazon()));
                                break;
                            case 7:
                                realm_value_tVarInmobi = c3585l.remoteconfig(c14076l.crashlytics());
                                break;
                            case 8:
                                realm_value_tVarInmobi = c11140l.metrica(c14076l.mopub().mopub());
                                break;
                            case 9:
                                realm_value_tVarInmobi = c11140l.ads(((C4695l) c14076l.isPro()).yandex);
                                break;
                            default:
                                C10754l.ads("If you want to convert a 'RealmAny' instance containing an object to a 'RealmValue' use 'realmAnyToRealmValue' (when working with 'RealmQuery') or 'realmAnyToRealmValueWithObjectImport' (when using an accessor).");
                                break;
                        }
                        break;
                }
            } else {
                realm_value_tVarInmobi = c3585l.signatures();
            }
            realm_value_t realm_value_tVar2 = realm_value_tVarInmobi;
            boolean[] zArr2 = new boolean[1];
            long ptr$cinterop_release2 = ((LongPointerWrapper) this.f33426l).getPtr$cinterop_release();
            int i3 = AbstractC9795l.yandex;
            realmcJNI.realm_set_erase(ptr$cinterop_release2, realm_value_tVar2.yandex, realm_value_tVar2, zArr2);
            z = zArr2[0];
            c3585l.tapsense();
        }
        crashlytics(admob() + 1);
        return z;
    }

    @Override // defpackage.InterfaceC2435l
    public boolean removeAll(Collection collection) {
        return AbstractC0653l.mopub(this, collection);
    }

    @Override // defpackage.InterfaceC2232l
    public void reset() {
        AbstractC1821l abstractC1821l = (AbstractC1821l) this.f33423l;
        abstractC1821l.reset();
        byte[] bArr = (byte[]) this.f33427l;
        abstractC1821l.update(bArr, 0, bArr.length);
    }

    public void signatures() throws IOException {
        ((BufferedOutputStream) this.f33423l).write((byte[]) this.f33427l, 0, this.f33424l);
        this.f33424l = 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (r10 == r6) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object startapp(int r9, defpackage.InterfaceC14029l r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.C8351l
            if (r0 == 0) goto L13
            r0 = r10
            lًؘۣ r0 = (defpackage.C8351l) r0
            int r1 = r0.f17283l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17283l = r1
            goto L18
        L13:
            lًؘۣ r0 = new lًؘۣ
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f17279l
            int r1 = r0.f17283l
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            lٍؗؐ r6 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L46
            if (r1 == r5) goto L40
            if (r1 == r4) goto L3a
            if (r1 != r3) goto L34
            int r9 = r0.f17282l
            java.util.Iterator r1 = r0.f17284l
            lٍؕۙ r2 = r0.f17281l
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L82
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r8)
            return r2
        L3a:
            int r9 = r0.f17282l
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L76
        L40:
            int r9 = r0.f17282l
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L60
        L46:
            defpackage.AbstractC2829l.crashlytics(r10)
            r8.f33424l = r9
            lؕٛؐ r10 = defpackage.C3496l.yandex
            java.lang.Object r1 = r8.f33423l
            lٕٝۢ r1 = (defpackage.InterfaceC15829l) r1
            java.lang.Object r7 = r8.f33427l
            lؒۖؕ r7 = (defpackage.InterfaceC1246l) r7
            r0.f17282l = r9
            r0.f17283l = r5
            java.lang.Object r10 = r10.yandex(r1, r7, r0)
            if (r10 != r6) goto L60
            goto L9c
        L60:
            lٖۖ r10 = defpackage.AbstractC11463l.yandex
            lؙۙؑ r10 = defpackage.ExecutorC6708l.f14063l
            l٘ٗؑ r1 = new l٘ٗؑ
            r5 = 24
            r1.<init>(r8, r2, r5)
            r0.f17282l = r9
            r0.f17283l = r4
            java.lang.Object r10 = defpackage.AbstractC10999l.firebase(r10, r1, r0)
            if (r10 != r6) goto L76
            goto L9c
        L76:
            lٍؕۙ r10 = (defpackage.C3597l) r10
            java.lang.Object r1 = r8.f33426l
            lَُۡ r1 = (defpackage.C10227l) r1
            r2 = 0
            java.util.ListIterator r1 = r1.listIterator(r2)
            r2 = r10
        L82:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L9d
            java.lang.Object r10 = r1.next()
            lُٞٙ r10 = (defpackage.InterfaceC11209l) r10
            r0.f17281l = r2
            r0.f17284l = r1
            r0.f17282l = r9
            r0.f17283l = r3
            java.lang.Object r10 = r8.m4283default(r10, r9, r2, r0)
            if (r10 != r6) goto L82
        L9c:
            return r6
        L9d:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17219l.startapp(int, lٌؚٓ):java.lang.Object");
    }

    /* JADX INFO: renamed from: static, reason: not valid java name */
    public void m4290static(C9185l c9185l) {
        if (this.f33424l == 2) {
            InterfaceC18212l interfaceC18212l = (InterfaceC18212l) this.f33423l;
            if (interfaceC18212l == null) {
                C8339l.smaato("layoutCoordinates not set");
                return;
            } else {
                AbstractC1163l.admob(c9185l, interfaceC18212l.mo2591strictfp(0L), new C3006l(25, (C13408l) this.f33426l), true);
            }
        }
        this.f33424l = 3;
    }

    @Override // defpackage.InterfaceC2435l
    public boolean subscription(Collection collection, int i, Map map) {
        return AbstractC0653l.loadAd(this, collection, i, map);
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public long m4291switch(long j) {
        C16328l c16328l = (C16328l) this.f33423l;
        return c16328l.crashlytics != null ? c16328l.billing(j) : j;
    }

    @Override // defpackage.InterfaceC17475l
    /* JADX INFO: renamed from: synchronized */
    public void mo1722synchronized(String str) throws IOException {
        byte b;
        isVip(0, str.length() + 2);
        char[] cArr = (char[]) this.f33426l;
        cArr[0] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, 1);
        int i = length + 1;
        int length2 = 1;
        while (length2 < i) {
            char c = cArr[length2];
            byte[] bArr = AbstractC4216l.loadAd;
            if (c < bArr.length && bArr[c] != 0) {
                int length3 = str.length();
                for (int i2 = length2 - 1; i2 < length3; i2++) {
                    isVip(length2, 2);
                    char cCharAt = str.charAt(i2);
                    byte[] bArr2 = AbstractC4216l.loadAd;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i3 = length2 + 1;
                        ((char[]) this.f33426l)[length2] = cCharAt;
                        length2 = i3;
                    } else if (b == 1) {
                        String str2 = AbstractC4216l.yandex[cCharAt];
                        isVip(length2, str2.length());
                        str2.getChars(0, str2.length(), (char[]) this.f33426l, length2);
                        length2 = str2.length() + length2;
                    } else {
                        char[] cArr2 = (char[]) this.f33426l;
                        cArr2[length2] = '\\';
                        cArr2[length2 + 1] = (char) b;
                        length2 += 2;
                    }
                }
                isVip(length2, 1);
                char[] cArr3 = (char[]) this.f33426l;
                cArr3[length2] = '\"';
                m4285final(cArr3, length2 + 1);
                signatures();
                return;
            }
            length2++;
        }
        cArr[i] = '\"';
        m4285final(cArr, length + 2);
        signatures();
    }

    public AbstractC11918l tapsense() {
        String str;
        if (((AbstractC11918l) this.f33426l).subscription(this.f33424l)) {
            AbstractC11918l abstractC11918lYandex = ((AbstractC11918l) this.f33426l).yandex();
            if (abstractC11918lYandex != ((AbstractC11918l) this.f33426l)) {
                synchronized (abstractC11918lYandex) {
                    abstractC11918lYandex.billing = this.f33424l;
                    abstractC11918lYandex.mopub = (C2723l) this.f33423l;
                    abstractC11918lYandex.admob = (AbstractC12754l) this.f33427l;
                }
                return abstractC11918lYandex;
            }
            str = "implementation returned current curve";
        } else {
            str = "unsupported coordinate system";
        }
        C8339l.smaato(str);
        return null;
    }

    @Override // defpackage.InterfaceC17475l
    /* JADX INFO: renamed from: throw */
    public void mo1723throw(String str) throws IOException {
        int length = str.length();
        isVip(0, length);
        str.getChars(0, length, (char[]) this.f33426l, 0);
        m4285final((char[]) this.f33426l, length);
    }

    @Override // defpackage.InterfaceC13504l
    /* JADX INFO: renamed from: throws */
    public byte[] mo1221throws(int i, byte[] bArr) {
        C16650l c16650l = (C16650l) this.f33423l;
        if (i <= this.f33424l) {
            ((Mac) c16650l.get()).update(bArr);
            return Arrays.copyOf(((Mac) c16650l.get()).doFinal(), i);
        }
        C18073l.pro("tag size too big");
        return null;
    }

    public String toString() {
        switch (this.f33425l) {
            case 7:
                return m4289private();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte b) {
        ((AbstractC1821l) this.f33423l).update(b);
    }

    @Override // defpackage.InterfaceC17475l
    public void writeLong(long j) throws IOException {
        mo1723throw(String.valueOf(j));
    }

    @Override // defpackage.InterfaceC2435l
    public NativePointer yandex() {
        return (LongPointerWrapper) this.f33426l;
    }

    @Override // defpackage.InterfaceC2232l
    public void update(byte[] bArr, int i, int i2) {
        ((AbstractC1821l) this.f33423l).update(bArr, i, i2);
    }

    public C17219l(AbstractC11918l abstractC11918l, int i, C2723l c2723l, AbstractC12754l abstractC12754l) {
        this.f33425l = 6;
        this.f33426l = abstractC11918l;
        this.f33424l = i;
        this.f33423l = c2723l;
        this.f33427l = abstractC12754l;
    }

    public C17219l(AbstractC1821l abstractC1821l) {
        this.f33425l = 9;
        this.f33427l = new byte[64];
        this.f33426l = new byte[64];
        this.f33423l = abstractC1821l;
        this.f33424l = abstractC1821l.getDigestSize();
    }

    public /* synthetic */ C17219l(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.f33425l = i2;
        this.f33423l = obj;
        this.f33427l = obj2;
        this.f33424l = i;
        this.f33426l = obj3;
    }

    public /* synthetic */ C17219l(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.f33425l = i2;
        this.f33423l = obj;
        this.f33427l = obj2;
        this.f33426l = obj3;
        this.f33424l = i;
    }

    public C17219l(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f33425l = 0;
        this.f33426l = new ServiceConnectionC16475l(this);
        this.f33424l = 1;
        this.f33427l = scheduledExecutorService;
        this.f33423l = context.getApplicationContext();
    }

    public C17219l(BufferedOutputStream bufferedOutputStream) {
        this.f33425l = 8;
        this.f33423l = bufferedOutputStream;
        this.f33427l = C5707l.crashlytics.crashlytics(AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE);
        this.f33426l = C11962l.crashlytics.amazon(128);
    }

    public C17219l(InterfaceC2262l interfaceC2262l, InterfaceC15829l interfaceC15829l, InterfaceC1246l interfaceC1246l) {
        int i = 15;
        this.f33425l = 15;
        this.f33423l = interfaceC15829l;
        this.f33427l = interfaceC1246l;
        this.f33424l = -1;
        C10227l c10227lAdmob = AbstractC14055l.admob();
        int i2 = 0;
        if (AbstractC9057l.yandex().contains(AudioEffect.EFFECT_TYPE_BASS_BOOST)) {
            c10227lAdmob.add(new C12269l(i2));
        }
        if (AbstractC9057l.yandex().contains(AudioEffect.EFFECT_TYPE_ENV_REVERB)) {
            c10227lAdmob.add(new C12269l(1));
        }
        if (Build.VERSION.SDK_INT >= 28 && AbstractC9057l.yandex().contains(UUID.fromString("7261676f-6d75-7369-6364-28e2fd3ac39e"))) {
            c10227lAdmob.add(new C13110l());
        }
        this.f33426l = AbstractC14055l.purchase(c10227lAdmob);
        AbstractC10999l.mopub(interfaceC2262l, null, 0, new C15352l(this, null, i), 3);
    }

    public C17219l(C17752l c17752l) {
        this.f33425l = 7;
        this.f33423l = c17752l;
        this.f33427l = new Object[8];
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.f33426l = iArr;
        this.f33424l = -1;
    }

    public C17219l(C13408l c13408l) {
        this.f33425l = 11;
        this.f33426l = c13408l;
        this.f33424l = 1;
    }

    public C17219l(int i, C11586l c11586l) {
        this.f33425l = 2;
        this.f33427l = new Object();
        this.f33424l = i;
        this.f33423l = new ArrayDeque(i);
        this.f33426l = c11586l;
    }

    public C17219l(InterfaceC16922l interfaceC16922l) {
        this.f33425l = 3;
        this.f33423l = interfaceC16922l;
        this.f33424l = interfaceC16922l.getDigestSize();
    }

    public C17219l() {
        this.f33425l = 10;
        this.f33423l = new Object();
        this.f33427l = null;
        this.f33426l = null;
        this.f33424l = 0;
    }

    public C17219l(C16328l c16328l) {
        this.f33425l = 5;
        this.f33423l = c16328l;
        this.f33426l = new C17893l(0, new Function1[16]);
    }

    public C17219l(int i, String str, int i2, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f33425l = 16;
        this.f33423l = str;
        this.f33424l = i2;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f33427l = listUnmodifiableList;
        this.f33426l = bArr;
    }

    public C17219l(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.f33425l = 13;
        this.f33423l = uuid;
        this.f33424l = i;
        this.f33427l = bArr;
        this.f33426l = uuidArr;
    }

    public C17219l(C5501l c5501l, InterfaceC7832l interfaceC7832l, LongPointerWrapper longPointerWrapper) {
        this.f33425l = 14;
        this.f33423l = c5501l;
        this.f33427l = interfaceC7832l;
        this.f33426l = longPointerWrapper;
    }

    @Override // defpackage.InterfaceC2435l
    public Object get(int i) {
        int i2;
        LongPointerWrapper longPointerWrapper = (LongPointerWrapper) this.f33426l;
        long j = i;
        realm_value_t realm_value_tVar = new realm_value_t();
        long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
        int i3 = AbstractC9795l.yandex;
        realmcJNI.realm_set_get(ptr$cinterop_release, j, realm_value_tVar.yandex, realm_value_tVar);
        C5501l c5501l = (C5501l) this.f33423l;
        InterfaceC7832l interfaceC7832l = (InterfaceC7832l) this.f33427l;
        int i4 = 0;
        boolean z = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) == 0;
        if (!z) {
            if (!z) {
                int iRealm_value_t_type_get = realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar);
                int[] iArrM1673throws = AbstractC5020l.m1673throws(14);
                int length = iArrM1673throws.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        i2 = 0;
                        break;
                    }
                    i2 = iArrM1673throws[i5];
                    if (AbstractC5020l.inmobi(i2) == iRealm_value_t_type_get) {
                        break;
                    }
                    i5++;
                }
                if (i2 != 0) {
                    switch (AbstractC5020l.inmobi(i2)) {
                        case 0:
                            break;
                        case 1:
                            return new C14076l(1, AbstractC18202l.yandex.loadAd(Long.TYPE), Long.valueOf(realmcJNI.realm_value_t_integer_get(realm_value_tVar.yandex, realm_value_tVar)));
                        case 2:
                            return new C14076l(2, AbstractC18202l.yandex.loadAd(Boolean.TYPE), Boolean.valueOf(realmcJNI.realm_value_t__boolean_get(realm_value_tVar.yandex, realm_value_tVar)));
                        case 3:
                            return new C14076l(3, AbstractC18202l.yandex.loadAd(String.class), realmcJNI.realm_value_t_string_get(realm_value_tVar.yandex, realm_value_tVar));
                        case 4:
                            realm_binary_t realm_binary_tVarYandex = realm_value_tVar.yandex();
                            return new C14076l(4, AbstractC18202l.yandex.loadAd(byte[].class), realmcJNI.realm_binary_t_data_get(realm_binary_tVarYandex.yandex, realm_binary_tVarYandex));
                        case 5:
                            return new C14076l(5, AbstractC18202l.yandex.loadAd(InterfaceC11616l.class), new C15729l(AbstractC10340l.loadAd(realm_value_tVar)));
                        case 6:
                            return new C14076l(6, AbstractC18202l.yandex.loadAd(Float.TYPE), Float.valueOf(realmcJNI.realm_value_t_fnum_get(realm_value_tVar.yandex, realm_value_tVar)));
                        case 7:
                            return new C14076l(7, AbstractC18202l.yandex.loadAd(Double.TYPE), Double.valueOf(realmcJNI.realm_value_t_dnum_get(realm_value_tVar.yandex, realm_value_tVar)));
                        case 8:
                            realm_decimal128_t realm_decimal128_tVarCrashlytics = realm_value_tVar.crashlytics();
                            long[] jArrRealm_decimal128_t_w_get = realmcJNI.realm_decimal128_t_w_get(realm_decimal128_tVarCrashlytics.yandex, realm_decimal128_tVarCrashlytics);
                            long[] jArrCopyOf = Arrays.copyOf(jArrRealm_decimal128_t_w_get, jArrRealm_decimal128_t_w_get.length);
                            C18316l c18316l = C15062l.Companion;
                            long j2 = jArrCopyOf[1];
                            long j3 = jArrCopyOf[0];
                            c18316l.getClass();
                            return new C14076l(8, AbstractC18202l.yandex.loadAd(C15062l.class), C18316l.yandex(j2, j3));
                        case 9:
                            BsonObjectId$Companion bsonObjectId$Companion = C17918l.Companion;
                            byte[] bArr = new byte[12];
                            realm_object_id_t realm_object_id_tVarAmazon = realm_value_tVar.amazon();
                            short[] sArrRealm_object_id_t_bytes_get = realmcJNI.realm_object_id_t_bytes_get(realm_object_id_tVarAmazon.yandex, realm_object_id_tVarAmazon);
                            ArrayList arrayList = new ArrayList(sArrRealm_object_id_t_bytes_get.length);
                            int length2 = sArrRealm_object_id_t_bytes_get.length;
                            int i6 = 0;
                            while (i4 < length2) {
                                bArr[i6] = (byte) sArrRealm_object_id_t_bytes_get[i4];
                                arrayList.add(Unit.INSTANCE);
                                i4++;
                                i6++;
                            }
                            bsonObjectId$Companion.getClass();
                            return new C14076l(9, AbstractC18202l.yandex.loadAd(C17918l.class), BsonObjectId$Companion.yandex(bArr));
                        case 10:
                            C2336l c2336l = AbstractC18202l.yandex;
                            return new C14076l(11, c2336l.loadAd(InterfaceC11343l.class), (InterfaceC11343l) (realmcJNI.realm_value_t_type_get(realm_value_tVar.yandex, realm_value_tVar) != 0 ? AbstractC6710l.isPro(AbstractC10340l.yandex(realm_value_tVar), c2336l.loadAd(InterfaceC11343l.class), c5501l, interfaceC7832l) : null));
                        case 11:
                            byte[] bArr2 = new byte[16];
                            realm_uuid_t realm_uuid_tVarPurchase = realm_value_tVar.purchase();
                            short[] sArrRealm_uuid_t_bytes_get = realmcJNI.realm_uuid_t_bytes_get(realm_uuid_tVarPurchase.yandex, realm_uuid_tVarPurchase);
                            ArrayList arrayList2 = new ArrayList(sArrRealm_uuid_t_bytes_get.length);
                            int length3 = sArrRealm_uuid_t_bytes_get.length;
                            int i7 = 0;
                            while (i4 < length3) {
                                bArr2[i7] = (byte) sArrRealm_uuid_t_bytes_get[i4];
                                arrayList2.add(Unit.INSTANCE);
                                i4++;
                                i7++;
                            }
                            return new C14076l(10, AbstractC18202l.yandex.loadAd(InterfaceC15393l.class), new C4695l(bArr2));
                        case 12:
                            C8339l.smaato("Set should never container lists");
                            return null;
                        case 13:
                            C8339l.smaato("Set should never container dictionaries");
                            return null;
                        default:
                            C8339l.metrica("Unsupported type: ".concat(AbstractC12589l.m3421native(i2)));
                            return null;
                    }
                } else {
                    C11983l.billing(iRealm_value_t_type_get, "Unknown value type: ");
                    return null;
                }
            } else {
                C18725l.billing();
                return null;
            }
        }
        return null;
    }
}
