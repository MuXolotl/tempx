package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Closeable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٗؓ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16864l implements InterfaceC2262l, Closeable {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32911l = AtomicIntegerFieldUpdater.newUpdater(C16864l.class, "closed");
    private volatile /* synthetic */ int closed = 0;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f32912l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C8403l f32913l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C8403l f32914l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C16990l f32915l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C2885l f32916l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C17535l f32917l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC12932l f32918l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C0462l f32919l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C16990l f32920l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C8403l f32921l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C8403l f32922l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C1770l f32923l;

    public C16864l(C2885l c2885l, C16990l c16990l, boolean z) {
        this.f32916l = c2885l;
        this.f32915l = c16990l;
        boolean z2 = false;
        InterfaceC12932l interfaceC12932l = c2885l.f6283l;
        C1083l c1083l = C1083l.f2996l;
        C0462l c0462l = new C0462l((InterfaceC7042l) interfaceC12932l.mo245l(c1083l));
        this.f32919l = c0462l;
        this.f32918l = c2885l.f6283l.mo246l(c0462l);
        int i = 3;
        this.f32922l = new C8403l(3);
        this.f32913l = new C8403l(4);
        C8403l c8403l = new C8403l(5);
        this.f32914l = c8403l;
        this.f32921l = new C8403l(2);
        int i2 = 1;
        this.f32917l = AbstractC4071l.yandex(true);
        this.f32923l = new C1770l(13);
        C16990l c16990l2 = new C16990l();
        this.f32920l = c16990l2;
        InterfaceC14029l interfaceC14029l = null;
        c8403l.firebase(C8403l.f17399l, new C17206l(this, c2885l, null));
        c8403l.firebase(C8403l.f17384l, new C14082l(this, interfaceC14029l, 4));
        int i3 = 16;
        c16990l2.yandex(AbstractC13424l.loadAd, new C17049l(i3));
        c16990l2.yandex(AbstractC0105l.crashlytics, new C17049l(i3));
        c16990l2.yandex(AbstractC17371l.amazon, new C17049l(i3));
        if (c16990l.f33118l) {
            ((LinkedHashMap) c16990l2.f33120l).put("DefaultTransformers", new C17049l(14));
        }
        c16990l2.yandex(C13308l.loadAd, new C17049l(i3));
        C18449l c18449l = AbstractC8486l.loadAd;
        c16990l2.yandex(c18449l, new C17049l(i3));
        if (c16990l.f33119l) {
            c16990l2.yandex(AbstractC17488l.amazon, new C17049l(i3));
        }
        c16990l2.purchase(c16990l);
        if (c16990l.f33118l) {
            c16990l2.yandex(AbstractC14083l.loadAd, new C17049l(i3));
        }
        C11911l c11911l = AbstractC16881l.yandex;
        c16990l2.yandex(c18449l, new C4741l(c16990l2));
        Iterator it = ((LinkedHashMap) c16990l2.f33117l).values().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this);
        }
        Iterator it2 = ((LinkedHashMap) c16990l2.f33120l).values().iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(this);
        }
        this.f32913l.firebase(C8403l.f17394l, new C7306l(this, z2, interfaceC14029l, i));
        this.f32912l = z;
        if (z) {
            AbstractC10545l.f21455l.incrementAndGet(c2885l);
            ((InterfaceC7042l) this.f32918l.mo245l(c1083l)).mo2154l(new C17015l(i2, c2885l));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        if (f32911l.compareAndSet(this, 0, 1)) {
            C17535l c17535l = (C17535l) this.f32917l.crashlytics(AbstractC14576l.yandex);
            Iterator it = c17535l.amazon().iterator();
            while (it.hasNext()) {
                Object objCrashlytics = c17535l.crashlytics((C11911l) it.next());
                if (objCrashlytics instanceof AutoCloseable) {
                    AutoCloseable autoCloseable = (AutoCloseable) objCrashlytics;
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        AbstractC14238l.subscription((ExecutorService) autoCloseable);
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                    } else if (autoCloseable instanceof MediaDrm) {
                        ((MediaDrm) autoCloseable).release();
                    } else if (autoCloseable instanceof DrmManagerClient) {
                        ((DrmManagerClient) autoCloseable).release();
                    } else {
                        if (!(autoCloseable instanceof ContentProviderClient)) {
                            C11983l.crashlytics();
                            return;
                        }
                        ((ContentProviderClient) autoCloseable).release();
                    }
                }
            }
            this.f32919l.m561l();
        }
    }

    public final String toString() {
        return "HttpClient[" + this.f32916l + ']';
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f32918l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(C6806l c6806l, AbstractC0283l abstractC0283l) {
        C12612l c12612l;
        if (abstractC0283l instanceof C12612l) {
            c12612l = (C12612l) abstractC0283l;
            int i = c12612l.f24843l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c12612l.f24843l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c12612l = new C12612l(this, abstractC0283l);
            }
        } else {
            c12612l = new C12612l(this, abstractC0283l);
        }
        Object objLoadAd = c12612l.f24842l;
        int i2 = c12612l.f24843l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objLoadAd);
            this.f32923l.vip(AbstractC12704l.f25026l, c6806l);
            Object obj = c6806l.amazon;
            c12612l.f24843l = 1;
            objLoadAd = this.f32922l.loadAd(c6806l, obj, c12612l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objLoadAd == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objLoadAd);
        }
        return (C14249l) objLoadAd;
    }
}
