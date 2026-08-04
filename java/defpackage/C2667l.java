package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.hardware.camera2.CameraCharacteristics;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;

/* JADX INFO: renamed from: lْؔٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2667l implements AutoCloseable {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final InterfaceC2262l f5776l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C5664l f5777l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C14588l f5778l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C14894l f5779l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C18548l f5780l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C18548l f5781l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C15400l f5782l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C18474l f5783l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C7276l f5784l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C9028l f5785l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C7230l f5786l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C14437l f5787l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C8958l f5788l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C8445l f5789l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C10013l f5790l;

    public C2667l(C7931l c7931l, InterfaceC5389l interfaceC5389l, C18548l c18548l, C18548l c18548l2, C5664l c5664l, C9028l c9028l, C7276l c7276l, C8958l c8958l, C14588l c14588l, C14894l c14894l, C14437l c14437l, C15400l c15400l, C8445l c8445l, C7230l c7230l, InterfaceC2262l interfaceC2262l, C10013l c10013l) {
        String str;
        String strYandex;
        ArrayList arrayList = c7931l.amazon;
        int i = c7931l.admob;
        List list = c5664l.f12043l;
        this.f5781l = c18548l;
        this.f5780l = c18548l2;
        this.f5777l = c5664l;
        this.f5785l = c9028l;
        this.f5784l = c7276l;
        this.f5788l = c8958l;
        this.f5778l = c14588l;
        this.f5779l = c14894l;
        this.f5787l = c14437l;
        this.f5782l = c15400l;
        this.f5789l = c8445l;
        this.f5786l = c7230l;
        this.f5776l = interfaceC2262l;
        this.f5790l = c10013l;
        this.f5783l = AbstractC1805l.yandex(false);
        String str2 = c7931l.yandex;
        C10861l c10861l = (C10861l) interfaceC5389l;
        Integer num = (Integer) c10861l.crashlytics(CameraCharacteristics.LENS_FACING);
        String str3 = "External";
        String str4 = "Unknown";
        if (num != null && num.intValue() == 0) {
            str = "Front";
        } else if (num != null && num.intValue() == 1) {
            str = "Back";
        } else {
            str = (num != null && num.intValue() == 2) ? "External" : "Unknown";
        }
        Integer num2 = (Integer) c10861l.crashlytics(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num2 != null && num2.intValue() == 0) {
            str3 = "Limited";
        } else if (num2 != null && num2.intValue() == 1) {
            str3 = "Full";
        } else if (num2 != null && num2.intValue() == 2) {
            str3 = "Legacy";
        } else if (num2 != null && num2.intValue() == 3) {
            str3 = "Level 3";
        } else if (num2 == null || num2.intValue() != 4) {
            str3 = "Unknown";
        }
        if (i == 1) {
            str4 = "High Speed";
        } else if (i == 0) {
            str4 = "Normal";
        } else if (i == 2) {
            str4 = "Extension";
        }
        int[] iArr = (int[]) c10861l.crashlytics(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        String str5 = (iArr == null || !AbstractC8669l.tapsense(iArr, 11)) ? "Physical" : "Logical";
        StringBuilder sb = new StringBuilder();
        sb.append(this + " (Camera " + str2 + ")\n");
        StringBuilder sbLicense = AbstractC14814l.license("  Facing:    ", str, " (", str5, ", ");
        sbLicense.append(str3);
        sbLicense.append(")\n");
        sb.append(sbLicense.toString());
        sb.append("  Mode:      " + str4 + '\n');
        sb.append("Outputs:\n");
        Iterator it = c5664l.f12037l.iterator();
        while (true) {
            int i2 = 12;
            if (!it.hasNext()) {
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                List<C8278l> list2 = list;
                if (!list2.isEmpty()) {
                    sb.append("Inputs:\n");
                    for (C8278l c8278l : list2) {
                        sb.append(" ");
                        sb.append(AbstractC12024l.m3329interface(12, "Input-" + c8278l.yandex));
                        sb.append(AbstractC12024l.m3329interface(12, C10134l.loadAd(c8278l.loadAd)));
                        sb.append(AbstractC12024l.m3329interface(12, String.valueOf(1)));
                        sb.append("\n");
                    }
                }
                sb.append("Session Template: " + C18221l.yandex(c7931l.billing) + '\n');
                AbstractC3483l.yandex(sb, "Session Parameters", c7931l.mopub);
                sb.append("Default Template: " + C18221l.yandex(c7931l.subs) + '\n');
                AbstractC3483l.yandex(sb, "Default Parameters", c7931l.isPro);
                AbstractC3483l.yandex(sb, "Required Parameters", c7931l.remoteconfig);
                Log.i("CXCP", sb.toString());
                if (i3 == 1) {
                    if (this.f5777l.f12038l.isEmpty()) {
                        C8339l.metrica("Cannot create a HIGH_SPEED CameraGraph without outputs.");
                        throw null;
                    }
                    int size = this.f5777l.f12038l.size();
                    C5664l c5664l2 = this.f5777l;
                    if (size > 2) {
                        C8936l.smaato(c5664l2.f12038l, "Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are ");
                        throw null;
                    }
                    ArrayList arrayList3 = c5664l2.f12038l;
                    if (arrayList3 == null || !arrayList3.isEmpty()) {
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            if (!((C16853l) it2.next()).yandex()) {
                                C8936l.smaato(this.f5777l.f12038l, "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are ");
                                throw null;
                            }
                        }
                    }
                }
                if (arrayList2 != null) {
                    if (arrayList2.isEmpty()) {
                        C8339l.metrica("At least one InputConfiguration is required for reprocessing");
                        throw null;
                    }
                    if (Build.VERSION.SDK_INT < 31 && arrayList2.size() > 1) {
                        C8339l.metrica("Multi resolution reprocessing not supported under Android S");
                        throw null;
                    }
                }
                if (this.f5777l.f12041l.isEmpty()) {
                    return;
                }
                this.f5785l.yandex();
                return;
            }
            Iterator it3 = ((C9494l) it.next()).loadAd.iterator();
            int i4 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    AbstractC14055l.subscription();
                    throw null;
                }
                C16853l c16853l = (C16853l) next;
                sb.append("  ");
                if (i4 == 0) {
                    C9494l c9494l = c16853l.isPro;
                    strYandex = C16755l.yandex((c9494l == null ? null : c9494l).yandex);
                } else {
                    strYandex = "";
                }
                sb.append(AbstractC12024l.m3329interface(i2, strYandex));
                sb.append(AbstractC12024l.m3329interface(i2, C13172l.yandex(c16853l.yandex)));
                String str6 = c16853l.amazon;
                sb.append(AbstractC12024l.m3329interface(i2, c16853l.loadAd.toString()));
                sb.append(AbstractC12024l.m3329interface(16, C10134l.yandex(c16853l.crashlytics)));
                C8259l c8259l = c16853l.purchase;
                if (c8259l != null) {
                    sb.append(" [" + ((Object) C8259l.yandex(c8259l.yandex)) + ']');
                }
                C4220l c4220l = c16853l.billing;
                Iterator it4 = it;
                ArrayList arrayList4 = arrayList;
                if (c4220l != null) {
                    sb.append(" [" + ((Object) C4220l.yandex(c4220l.yandex)) + ']');
                }
                C5565l c5565l = c16853l.mopub;
                int i6 = i;
                if (c5565l != null) {
                    long j = c5565l.yandex;
                    StringBuilder sb2 = new StringBuilder(" [");
                    sb2.append((Object) ("StreamUseCase(value=" + j + ')'));
                    sb2.append(']');
                    sb.append(sb2.toString());
                }
                C5959l c5959l = c16853l.subs;
                if (c5959l != null) {
                    long j2 = c5959l.yandex;
                    StringBuilder sb3 = new StringBuilder(" [");
                    sb3.append((Object) ("StreamUseHint(value=" + j2 + ')'));
                    sb3.append(']');
                    sb.append(sb3.toString());
                }
                if (!AbstractC8576l.yandex(str6, str2)) {
                    sb.append(" [");
                    sb.append(new C10160l(str6));
                    sb.append("]");
                }
                sb.append("\n");
                it = it4;
                it3 = it3;
                i = i6;
                arrayList = arrayList4;
                i4 = i5;
                list = list;
                i2 = 12;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0133  */
    public final void billing(int i, Surface surface) throws Exception {
        String str;
        AutoCloseable autoCloseable;
        Trace.beginSection(((Object) C16755l.yandex(i)) + "#setSurface");
        if (surface != null && !surface.isValid()) {
            Log.w("CXCP", this + "#setSurface: " + surface + " is invalid");
        }
        C9028l c9028l = this.f5785l;
        if (c9028l.f18592l.keySet().contains(new C16755l(i))) {
            StringBuilder sb = new StringBuilder("Cannot configure surface for ");
            sb.append((Object) C16755l.yandex(i));
            C18353l.adcel(sb, ", it is permanently assigned to ", c9028l.f18592l.get(new C16755l(i)));
            return;
        }
        synchronized (c9028l.f18591l) {
            if (!c9028l.f18593l) {
                if (surface != null) {
                    str = "Configured " + ((Object) C16755l.yandex(i)) + " with " + surface;
                } else {
                    str = "Removed surface for " + ((Object) C16755l.yandex(i));
                }
                Log.i("CXCP", str);
                LinkedHashMap linkedHashMap = c9028l.f18594l;
                if (surface == null) {
                    Surface surface2 = (Surface) linkedHashMap.remove(new C16755l(i));
                    if (!c9028l.f18588l || surface2 == null) {
                        autoCloseable = null;
                    } else {
                        autoCloseable = (AutoCloseable) c9028l.f18587l.remove(surface2);
                    }
                } else {
                    Surface surface3 = (Surface) linkedHashMap.get(new C16755l(i));
                    c9028l.f18594l.put(new C16755l(i), surface);
                    if (!c9028l.f18588l || AbstractC8576l.yandex(surface3, surface)) {
                        autoCloseable = null;
                    } else {
                        if (c9028l.f18587l.containsKey(surface)) {
                            throw new IllegalStateException(("Surface (" + surface + ") is already in use!").toString());
                        }
                        autoCloseable = (AutoCloseable) AbstractC9464l.loadAd(c9028l.f18587l).remove(surface3);
                        c9028l.f18587l.put(surface, c9028l.f18586l.yandex(surface));
                    }
                }
                c9028l.yandex();
                if (autoCloseable != null) {
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
            } else if (surface != null) {
                Log.w("CXCP", "Refusing to configure " + ((Object) C16755l.yandex(i)) + " with " + surface + " after close!");
            }
        }
        Trace.endSection();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f5783l.yandex()) {
            Trace.beginSection(this + "#close");
            StringBuilder sb = new StringBuilder("Closing ");
            sb.append(this);
            Log.i("CXCP", sb.toString());
            this.f5781l.loadAd.close();
            C7276l c7276l = this.f5784l;
            synchronized (c7276l.startapp) {
                try {
                    if (!c7276l.billing()) {
                        c7276l.ads = C10370l.amazon;
                        Log.d("CXCP", "Closed " + c7276l);
                        C17266l c17266l = c7276l.ad;
                        C15202l c15202l = c7276l.advert;
                        c7276l.ad = null;
                        c7276l.advert = null;
                        C7504l c7504l = c7276l.license;
                        if (c7504l != null) {
                            c7504l.ads(null);
                        }
                        C7504l c7504l2 = c7276l.signatures;
                        if (c7504l2 != null) {
                            c7504l2.ads(null);
                        }
                        c7276l.signatures = null;
                        C7504l c7504l3 = c7276l.premium;
                        if (c7504l3 != null) {
                            c7504l3.ads(null);
                        }
                        c7276l.premium = null;
                        C7504l c7504l4 = c7276l.applovin;
                        if (c7504l4 != null) {
                            c7504l4.ads(null);
                        }
                        c7276l.applovin = null;
                        AbstractC14814l.ad(c7276l.billing);
                        c7276l.purchase(c15202l, c17266l);
                        C7931l c7931l = c7276l.crashlytics;
                        if (c7931l.metrica.purchase || c7276l.firebase.yandex(c7931l.yandex)) {
                            Log.d("CXCP", "Quirk: Closing " + ((Object) C10160l.loadAd(c7276l.crashlytics.yandex)) + " during " + c7276l + "#close");
                            c7276l.subs.yandex(c7276l.crashlytics.yandex);
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f5788l.close();
            this.f5778l.close();
            this.f5785l.close();
            this.f5777l.close();
            this.f5779l.amazon(this);
            AbstractC11990l.billing(this.f5776l, null);
            Trace.endSection();
        }
    }

    public final void mopub() {
        if (this.f5783l.loadAd()) {
            C8936l.firebase(this, " after calling close()", "Cannot start ");
            return;
        }
        Trace.beginSection(this + "#start");
        StringBuilder sb = new StringBuilder("Starting ");
        sb.append(this);
        Log.i("CXCP", sb.toString());
        C18548l c18548l = this.f5780l;
        c18548l.getClass();
        Log.d("CXCP", c18548l + " onGraphStarting");
        C1008l c1008l = c18548l.amazon;
        C13339l c13339l = C13339l.crashlytics;
        c1008l.getClass();
        c1008l.remoteconfig(null, c13339l);
        for (C7686l c7686l : c18548l.crashlytics) {
            C7647l c7647l = c7686l.yandex;
            C2667l c2667l = c7686l.loadAd;
            if (c2667l == null) {
                c2667l = null;
            }
            c7647l.loadAd(c2667l, c13339l);
        }
        C7276l c7276l = this.f5784l;
        synchronized (c7276l.startapp) {
            c7276l.mopub();
            Unit unit = Unit.INSTANCE;
        }
        Trace.endSection();
    }

    public final String toString() {
        return this.f5787l.yandex;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(AbstractC0283l abstractC0283l) {
        C16973l c16973l;
        if (abstractC0283l instanceof C16973l) {
            c16973l = (C16973l) abstractC0283l;
            int i = c16973l.f33093l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c16973l.f33093l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c16973l = new C16973l(this, abstractC0283l);
            }
        } else {
            c16973l = new C16973l(this, abstractC0283l);
        }
        Object objYandex = c16973l.f33092l;
        int i2 = c16973l.f33093l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objYandex);
            c16973l.f33093l = 1;
            objYandex = this.f5786l.yandex(c16973l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objYandex == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objYandex);
        }
        return new C10069l((C17726l) objYandex, this.f5781l, this.f5790l, this.f5782l, this.f5789l);
    }
}
