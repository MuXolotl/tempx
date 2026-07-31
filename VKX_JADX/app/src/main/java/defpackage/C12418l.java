package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.car.app.navigation.model.Maneuver;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_version_id_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkxreborn.playback.widget_glance.player_small.SmallPlayerGlanceConfigurationActivity;

/* JADX INFO: renamed from: lؘّٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12418l implements InterfaceC6581l, InterfaceC14314l, InterfaceC17443l, InterfaceC14606l, InterfaceC3905l, InterfaceC11545l, InterfaceC15111l, InterfaceC11139l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static C12418l f24516l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static C12418l f24517l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f24518l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f24519l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24520l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f24521l;

    public C12418l(int i) {
        this.f24520l = i;
        switch (i) {
            case 2:
                break;
            case 13:
                this.f24519l = new C17235l("", 0L, null);
                this.f24518l = new C17235l("", 0L, null);
                this.f24521l = new ArrayList();
                break;
            case 14:
                this.f24519l = new HashMap();
                this.f24518l = new HashMap();
                this.f24521l = C4267l.crashlytics;
                break;
            default:
                long[] jArr = AbstractC12154l.yandex;
                this.f24519l = new C13660l();
                break;
        }
    }

    public static C12418l metrica(String str, C9358l c9358l, AbstractC15257l abstractC15257l) throws GeneralSecurityException {
        Charset charset = AbstractC0647l.yandex;
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i] = (byte) cCharAt;
        }
        C0346l.yandex(bArr);
        return new C12418l(abstractC15257l, str, c9358l, 1);
    }

    public static C12418l pro(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C12418l(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static C12418l startapp(C18085l c18085l) {
        C12418l c12418l = new C12418l(2);
        c12418l.f24519l = c18085l.yandex;
        c12418l.f24518l = c18085l.loadAd;
        c12418l.f24521l = c18085l.crashlytics;
        return c12418l;
    }

    public Typeface Signature(int i, int i2, C8818l c8818l) {
        int resourceId = ((TypedArray) this.f24518l).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f24521l) == null) {
            this.f24521l = new TypedValue();
        }
        Context context = (Context) this.f24519l;
        TypedValue typedValue = (TypedValue) this.f24521l;
        ThreadLocal threadLocal = AbstractC7525l.yandex;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC7525l.crashlytics(context, resourceId, typedValue, i2, c8818l, true, false);
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        C11963l c11963l = (C11963l) obj;
        C13132l c13132l = new C13132l((C2350l) obj2);
        String str = (String) this.f24519l;
        C18096l c18096l = (C18096l) this.f24518l;
        C13469l c13469l = (C13469l) this.f24521l;
        c11963l.getClass();
        BinderC11501l binderC11501l = new BinderC11501l(c18096l);
        c11963l.f23838synchronized.add(binderC11501l);
        C13452l c13452l = (C13452l) c11963l.metrica();
        C7935l c7935l = new C7935l();
        c7935l.f16524l = new BinderC3756l(c13132l);
        c7935l.f16520l = str;
        c7935l.f16526l = "vkx_cdcm";
        c7935l.f16527l = c13469l;
        c7935l.f16521l = binderC11501l;
        Parcel parcelM743l = c13452l.m743l();
        int i = AbstractC14866l.yandex;
        parcelM743l.writeInt(1);
        c7935l.writeToParcel(parcelM743l, 0);
        c13452l.m742l(parcelM743l, 2001);
    }

    public void ad(EnumC14812l enumC14812l) {
        RunnableC0566l runnableC0566l = (RunnableC0566l) this.f24521l;
        if (runnableC0566l != null) {
            runnableC0566l.run();
        }
        RunnableC0566l runnableC0566l2 = new RunnableC0566l((C5268l) this.f24519l, enumC14812l);
        this.f24521l = runnableC0566l2;
        ((Handler) this.f24518l).postAtFrontOfQueue(runnableC0566l2);
    }

    public ColorStateList adcel(int i) {
        int resourceId;
        ColorStateList colorStateListCrashlytics;
        TypedArray typedArray = (TypedArray) this.f24518l;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListCrashlytics = AbstractC7720l.crashlytics((Context) this.f24519l, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListCrashlytics;
    }

    @Override // defpackage.InterfaceC17320l
    public boolean admob() {
        return ((InterfaceC6581l) this.f24521l).admob();
    }

    public Drawable ads(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f24518l;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC13273l.loadAd((Context) this.f24519l, resourceId);
    }

    public void advert() {
        ((TypedArray) this.f24518l).recycle();
    }

    @Override // defpackage.InterfaceC14606l
    public void amazon(Object obj) {
        AbstractC11356l.subs((ListenableFuture) this.f24519l, (C5807l) this.f24518l);
    }

    @Override // defpackage.InterfaceC17320l
    public void billing(C2759l c2759l) {
        ((InterfaceC6581l) this.f24521l).billing(c2759l);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f24520l) {
            case 13:
                C12418l c12418l = new C12418l(((C17235l) this.f24519l).clone());
                Iterator it = ((ArrayList) this.f24521l).iterator();
                while (it.hasNext()) {
                    ((ArrayList) c12418l.f24521l).add(((C17235l) it.next()).clone());
                }
                return c12418l;
            default:
                return super.clone();
        }
    }

    @Override // defpackage.InterfaceC17320l
    public InterfaceC18636l crashlytics() {
        return (C4543l) this.f24519l;
    }

    @Override // defpackage.InterfaceC6581l
    public C8403l firebase() {
        return (C8403l) this.f24518l;
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        return new C10111l((Context) ((InterfaceC15897l) this.f24519l).get(), (C16163l) ((InterfaceC15897l) this.f24518l).get(), (C6724l) ((C2183l) this.f24521l).get(), 22);
    }

    @Override // defpackage.InterfaceC14314l
    public String getAlgorithm() {
        return "HASH-DRBG-".concat(AbstractC16336l.crashlytics((C17711l) this.f24519l));
    }

    @Override // defpackage.InterfaceC17320l
    public C2759l isPro() {
        return ((InterfaceC6581l) this.f24521l).isPro();
    }

    public void isVip(C5765l c5765l) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll((Collection) ((C11561l) this.f24521l).yandex);
        ((C11534l) this.f24518l).crashlytics(((AbstractC17054l) this.f24519l) + " TRACK-VERSION " + AbstractC4338l.vip(c5765l), new Object[0]);
        linkedHashSet.add(new C8195l(c5765l.f12151l, new WeakReference(c5765l)));
        ((C11561l) this.f24521l).yandex = linkedHashSet;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object license(AbstractC0283l abstractC0283l) {
        C10816l c10816l;
        if (abstractC0283l instanceof C10816l) {
            c10816l = (C10816l) abstractC0283l;
            int i = c10816l.f21857l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c10816l.f21857l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c10816l = new C10816l(this, abstractC0283l);
            }
        } else {
            c10816l = new C10816l(this, abstractC0283l);
        }
        Object objCrashlytics = c10816l.f21858l;
        int i2 = c10816l.f21857l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objCrashlytics);
            SmallPlayerGlanceConfigurationActivity smallPlayerGlanceConfigurationActivity = (SmallPlayerGlanceConfigurationActivity) this.f24519l;
            C15656l c15656l = C15656l.crashlytics;
            C3445l c3445l = (C3445l) this.f24518l;
            c10816l.f21859l = this;
            c10816l.f21857l = 1;
            objCrashlytics = C18188l.yandex.crashlytics(smallPlayerGlanceConfigurationActivity, c15656l, AbstractC13743l.crashlytics(c3445l.yandex), c10816l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objCrashlytics == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = c10816l.f21859l;
            AbstractC2829l.crashlytics(objCrashlytics);
        }
        ((C10086l) this.f24521l).setValue(((C14690l) objCrashlytics).f28754l);
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC17320l
    public C17839l loadAd() {
        return ((InterfaceC6581l) this.f24521l).loadAd();
    }

    @Override // defpackage.InterfaceC14606l
    public void mopub(Throwable th) {
        boolean z = th instanceof CancellationException;
        C5807l c5807l = (C5807l) this.f24518l;
        if (z) {
            AbstractC5641l.purchase(null, c5807l.amazon(new C12424l(((String) this.f24521l).concat(" cancelled."), th)));
        } else {
            c5807l.loadAd(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008c  */
    /* JADX WARN: Code duplicated, block: B:20:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.InterfaceC15111l, defpackage.InterfaceC11139l
    public void purchase(String str, int i, Throwable th, byte[] bArr, Map map) {
        int i2;
        EnumC1533l enumC1533l;
        AtomicReference atomicReference;
        switch (this.f24520l) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C11675l c11675l = (C11675l) this.f24519l;
                c11675l.mo211l();
                C8736l c8736l = (C8736l) this.f24521l;
                if (i != 200 && i != 204) {
                    i2 = 304;
                    if (i != 304) {
                        i2 = i;
                    }
                    C8118l c8118l = ((C17417l) c11675l.f833l).f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16910l.amazon("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(c8736l.f17986l), Integer.valueOf(i2), th);
                    if (Arrays.asList(((String) AbstractC5981l.Signature.yandex(null)).split(",")).contains(String.valueOf(i2))) {
                        enumC1533l = EnumC1533l.BACKOFF;
                    } else {
                        enumC1533l = EnumC1533l.FAILURE;
                    }
                    atomicReference = (AtomicReference) this.f24518l;
                    C11860l c11860lFirebase = ((C17417l) c11675l.f833l).firebase();
                    long j = c8736l.f17986l;
                    C17261l c17261l = new C17261l(enumC1533l.f3806l, j, c8736l.f17989l);
                    c11860lFirebase.mo211l();
                    c11860lFirebase.m2935l();
                    c11860lFirebase.m3267l(new RunnableC7706l(c11860lFirebase, c11860lFirebase.m3269l(true), c17261l, false, 14));
                    C8118l c8118l2 = ((C17417l) c11675l.f833l).f33950l;
                    C17417l.admob(c8118l2);
                    c8118l2.f16911l.crashlytics(Long.valueOf(j), enumC1533l, "[sgtm] Updated status for row_id");
                    synchronized (atomicReference) {
                        atomicReference.set(enumC1533l);
                        atomicReference.notifyAll();
                        break;
                    }
                    return;
                }
                i2 = i;
                if (th == null) {
                    C8118l c8118l3 = ((C17417l) c11675l.f833l).f33950l;
                    C17417l.admob(c8118l3);
                    c8118l3.f16911l.loadAd(Long.valueOf(c8736l.f17986l), "[sgtm] Upload succeeded for row_id");
                    enumC1533l = EnumC1533l.SUCCESS;
                } else {
                    C8118l c8118l4 = ((C17417l) c11675l.f833l).f33950l;
                    C17417l.admob(c8118l4);
                    c8118l4.f16910l.amazon("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(c8736l.f17986l), Integer.valueOf(i2), th);
                    if (Arrays.asList(((String) AbstractC5981l.Signature.yandex(null)).split(",")).contains(String.valueOf(i2))) {
                        enumC1533l = EnumC1533l.BACKOFF;
                    } else {
                        enumC1533l = EnumC1533l.FAILURE;
                    }
                }
                atomicReference = (AtomicReference) this.f24518l;
                C11860l c11860lFirebase2 = ((C17417l) c11675l.f833l).firebase();
                long j2 = c8736l.f17986l;
                C17261l c17261l2 = new C17261l(enumC1533l.f3806l, j2, c8736l.f17989l);
                c11860lFirebase2.mo211l();
                c11860lFirebase2.m2935l();
                c11860lFirebase2.m3267l(new RunnableC7706l(c11860lFirebase2, c11860lFirebase2.m3269l(true), c17261l2, false, 14));
                C8118l c8118l5 = ((C17417l) c11675l.f833l).f33950l;
                C17417l.admob(c8118l5);
                c8118l5.f16911l.crashlytics(Long.valueOf(j2), enumC1533l, "[sgtm] Updated status for row_id");
                synchronized (atomicReference) {
                    atomicReference.set(enumC1533l);
                    atomicReference.notifyAll();
                    return;
                }
            default:
                ((C6901l) this.f24521l).Signature(true, i, th, bArr, (String) this.f24519l, (ArrayList) this.f24518l, map);
                return;
        }
    }

    public void remoteconfig() {
        Iterator it = ((Iterable) ((C11561l) this.f24521l).yandex).iterator();
        while (it.hasNext()) {
            NativePointer nativePointer = (NativePointer) ((C8195l) it.next()).f17098l;
            C11534l c11534l = (C11534l) this.f24518l;
            AbstractC17054l abstractC17054l = (AbstractC17054l) this.f24519l;
            long jNew_realm_version_id_t = realmcJNI.new_realm_version_id_t();
            realm_version_id_t realm_version_id_tVar = new realm_version_id_t();
            realm_version_id_tVar.loadAd = true;
            realm_version_id_tVar.yandex = jNew_realm_version_id_t;
            boolean[] zArr = new boolean[1];
            long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
            int i = AbstractC9795l.yandex;
            realmcJNI.realm_get_version_id(ptr$cinterop_release, zArr, realm_version_id_tVar.yandex, realm_version_id_tVar);
            if (!zArr[0]) {
                C8339l.smaato("No VersionId was available. Reading the VersionId requires a valid read transaction.");
                return;
            }
            c11534l.crashlytics(abstractC17054l + " CLOSE-ACTIVE " + new C10821l(realmcJNI.realm_version_id_t_version_get(realm_version_id_tVar.yandex, realm_version_id_tVar)), new Object[0]);
            realmcJNI.realm_close(((LongPointerWrapper) nativePointer).getPtr$cinterop_release());
        }
    }

    public synchronized void signatures(int i, int i2, long j, long j2) {
        ((C17417l) this.f24519l).f33951l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.f24521l;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((C7560l) this.f24518l).mopub(new C12798l(0, Arrays.asList(new C0152l(36301, i, 0, j, j2, null, null, 0, i2)))).crashlytics(new C3253l(this, jElapsedRealtime, 8));
    }

    @Override // defpackage.InterfaceC17320l
    public boolean smaato() {
        return ((InterfaceC6581l) this.f24521l).smaato();
    }

    @Override // defpackage.InterfaceC3905l
    public /* bridge */ /* synthetic */ InterfaceC3905l subs(Class cls, InterfaceC18528l interfaceC18528l) {
        ((HashMap) this.f24519l).put(cls, interfaceC18528l);
        ((HashMap) this.f24518l).remove(cls);
        return this;
    }

    public Drawable subscription(int i) {
        int resourceId;
        Drawable drawableMopub;
        if (!((TypedArray) this.f24518l).hasValue(i) || (resourceId = ((TypedArray) this.f24518l).getResourceId(i, 0)) == 0) {
            return null;
        }
        C7862l c7862lYandex = C7862l.yandex();
        Context context = (Context) this.f24519l;
        synchronized (c7862lYandex) {
            drawableMopub = c7862lYandex.yandex.mopub(context, resourceId, true);
        }
        return drawableMopub;
    }

    @Override // defpackage.InterfaceC14314l
    public InterfaceC4190l tapsense(InterfaceC13380l interfaceC13380l) {
        C17711l c17711l = (C17711l) this.f24519l;
        byte[] bArr = (byte[]) this.f24521l;
        byte[] bArr2 = (byte[]) this.f24518l;
        C16544l c16544l = new C16544l();
        if (256 > ((Integer) AbstractC18559l.yandex.get("SHA-512")).intValue()) {
            C8339l.metrica("Requested security strength is not supported by the derivation function");
            return null;
        }
        if (interfaceC13380l.entropySize() < 256) {
            C8339l.metrica("Not enough entropy for security strength required");
            return null;
        }
        c16544l.f32489l = c17711l;
        c16544l.f32490l = interfaceC13380l;
        c16544l.f32492l = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        int iIntValue = ((Integer) C16544l.f32485l.get("SHA-512")).intValue();
        c16544l.f32487l = iIntValue;
        byte[] entropy = interfaceC13380l.getEntropy();
        if (entropy.length < (PSKKeyManager.MAX_KEY_LENGTH_BYTES + 7) / 8) {
            C8339l.smaato("Insufficient entropy provided by entropy source");
            return null;
        }
        byte[] bArrYandex = AbstractC18559l.yandex(c17711l, AbstractC14024l.admob(entropy, bArr2, bArr), iIntValue);
        c16544l.f32488l = bArrYandex;
        byte[] bArr3 = new byte[bArrYandex.length + 1];
        System.arraycopy(bArrYandex, 0, bArr3, 1, bArrYandex.length);
        c16544l.f32486l = AbstractC18559l.yandex(c17711l, bArr3, iIntValue);
        c16544l.f32491l = 1L;
        return c16544l;
    }

    public void vip() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C8195l c8195l : (Iterable) ((C11561l) this.f24521l).yandex) {
            NativePointer nativePointer = (NativePointer) c8195l.f17098l;
            if (((WeakReference) c8195l.f17097l).get() == null) {
                C11534l c11534l = (C11534l) this.f24518l;
                AbstractC17054l abstractC17054l = (AbstractC17054l) this.f24519l;
                long jNew_realm_version_id_t = realmcJNI.new_realm_version_id_t();
                realm_version_id_t realm_version_id_tVar = new realm_version_id_t();
                realm_version_id_tVar.loadAd = true;
                realm_version_id_tVar.yandex = jNew_realm_version_id_t;
                boolean[] zArr = new boolean[1];
                long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
                int i = AbstractC9795l.yandex;
                realmcJNI.realm_get_version_id(ptr$cinterop_release, zArr, realm_version_id_tVar.yandex, realm_version_id_tVar);
                if (!zArr[0]) {
                    C8339l.smaato("No VersionId was available. Reading the VersionId requires a valid read transaction.");
                    return;
                }
                c11534l.crashlytics(abstractC17054l + " CLOSE-FREED " + realmcJNI.realm_version_id_t_version_get(realm_version_id_tVar.yandex, realm_version_id_tVar), new Object[0]);
                realmcJNI.realm_close(((LongPointerWrapper) nativePointer).getPtr$cinterop_release());
            } else {
                linkedHashSet.add(c8195l);
            }
        }
        ((C11561l) this.f24521l).yandex = linkedHashSet;
    }

    @Override // defpackage.InterfaceC17320l
    public C5501l yandex() {
        return ((InterfaceC6581l) this.f24521l).yandex();
    }

    public /* synthetic */ C12418l(C1062l c1062l, String str, C18096l c18096l, C13469l c13469l) {
        this.f24520l = 15;
        this.f24519l = str;
        this.f24518l = c18096l;
        this.f24521l = c13469l;
    }

    public C12418l(Context context, C17417l c17417l) {
        this.f24520l = 16;
        this.f24521l = new AtomicLong(-1L);
        this.f24518l = new C7560l(context, C7560l.smaato, new C11468l("measurement:api"), C1308l.crashlytics);
        this.f24519l = c17417l;
    }

    public C12418l(C6901l c6901l, String str, ArrayList arrayList) {
        this.f24520l = 18;
        this.f24519l = str;
        this.f24518l = arrayList;
        this.f24521l = c6901l;
    }

    public C12418l(C17235l c17235l) {
        this.f24520l = 13;
        this.f24519l = c17235l;
        this.f24518l = c17235l.clone();
        this.f24521l = new ArrayList();
    }

    public C12418l(AbstractServiceC4696l abstractServiceC4696l) {
        this.f24520l = 6;
        this.f24519l = new C5268l(abstractServiceC4696l, true);
        this.f24518l = new Handler(Looper.getMainLooper());
    }

    public C12418l(AbstractC17054l abstractC17054l, C11534l c11534l) {
        this.f24520l = 12;
        this.f24519l = abstractC17054l;
        this.f24518l = c11534l;
        this.f24521l = AbstractC1805l.crashlytics(new LinkedHashSet());
    }

    public C12418l(Context context, TypedArray typedArray) {
        this.f24520l = 9;
        this.f24519l = context;
        this.f24518l = typedArray;
    }

    public C12418l(Context context, LocationManager locationManager) {
        this.f24520l = 10;
        this.f24521l = new C8807l();
        this.f24519l = context;
        this.f24518l = locationManager;
    }

    public C12418l(SmallPlayerGlanceConfigurationActivity smallPlayerGlanceConfigurationActivity, C3445l c3445l) {
        this.f24520l = 7;
        this.f24519l = smallPlayerGlanceConfigurationActivity;
        this.f24518l = c3445l;
        new C12183l(smallPlayerGlanceConfigurationActivity);
        this.f24521l = AbstractC8020l.smaato(EnumC15312l.RECOMMENDATIONS);
    }

    public /* synthetic */ C12418l(Object obj, Object obj2, Object obj3, int i) {
        this.f24520l = i;
        this.f24519l = obj;
        this.f24518l = obj2;
        this.f24521l = obj3;
    }
}
