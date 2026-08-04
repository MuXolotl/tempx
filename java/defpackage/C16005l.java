package defpackage;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlin.Unit;

/* JADX INFO: renamed from: lٕۢٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16005l extends AbstractC6896l {
    public C2525l Signature;
    public C5571l license;
    public final Size subscription;
    public final Object tapsense;

    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    public C16005l(C15736l c15736l, C12402l c12402l, C13283l c13283l) {
        Size[] outputSizes;
        Size[] sizeArr;
        super(c12402l);
        Size size = AbstractC15794l.yandex;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((C10861l) c15736l.loadAd).crashlytics(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        Size size2 = null;
        if (streamConfigurationMap == null) {
            if (AbstractC5088l.smaato()) {
                Log.e("CXCP", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            }
            outputSizes = null;
        } else {
            outputSizes = streamConfigurationMap.getOutputSizes(34);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            Size size3 = AbstractC18286l.yandex;
            if (((RepeatingStreamConstraintForVideoRecordingQuirk) AbstractC17919l.yandex(RepeatingStreamConstraintForVideoRecordingQuirk.class)) == null) {
                sizeArr = outputSizes;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Size size4 : outputSizes) {
                    if (AbstractC18286l.loadAd.compare(size4, AbstractC18286l.yandex) >= 0) {
                        arrayList.add(size4);
                    }
                }
                sizeArr = (Size[]) arrayList.toArray(new Size[0]);
            }
            if (sizeArr.length != 0) {
                outputSizes = sizeArr;
            } else if (AbstractC5088l.metrica()) {
                Log.w("CXCP", "No supported output size list, fallback to current list");
            }
            if (outputSizes.length > 1) {
                C15696l c15696l = new C15696l(1);
                if (outputSizes.length > 1) {
                    Arrays.sort(outputSizes, c15696l);
                }
            }
            Size sizeCrashlytics = c13283l.crashlytics();
            long jMin = Math.min(307200L, ((long) sizeCrashlytics.getWidth()) * ((long) sizeCrashlytics.getHeight()));
            int length = outputSizes.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Size size5 = outputSizes[i];
                    long width = ((long) size5.getWidth()) * ((long) size5.getHeight());
                    if (width == jMin) {
                        size = size5;
                    } else if (width <= jMin) {
                        i++;
                        size2 = size5;
                    } else if (size2 != null) {
                        size = size2;
                    }
                }
                if (size2 == null) {
                    size = outputSizes[0];
                } else {
                    size = size2;
                }
            }
        }
        this.subscription = size;
        this.tapsense = new Object();
    }

    @Override // defpackage.AbstractC6896l
    public final C5464l isVip(C5464l c5464l, C5464l c5464l2) {
        Size size = this.subscription;
        m2081throws(Collections.singletonList(m4126strictfp(size).crashlytics()));
        C6472l c6472lLoadAd = c5464l.loadAd();
        c6472lLoadAd.f13512l = size;
        return c6472lLoadAd.yandex();
    }

    @Override // defpackage.AbstractC6896l
    public final InterfaceC0048l mopub(boolean z, InterfaceC10139l interfaceC10139l) {
        return new C12402l();
    }

    @Override // defpackage.AbstractC6896l
    public final void signatures() {
        C2525l c2525l = this.Signature;
        if (c2525l != null) {
            c2525l.loadAd();
        }
        this.Signature = null;
        synchronized (this.tapsense) {
            try {
                C5571l c5571l = this.license;
                if (c5571l != null) {
                    c5571l.yandex();
                }
                this.license = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.AbstractC6896l
    public final InterfaceC16651l smaato(InterfaceC17944l interfaceC17944l) {
        return new C16936l(6);
    }

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public final C16774l m4126strictfp(Size size) {
        C5571l c5571lM4127synchronized;
        synchronized (this.tapsense) {
            c5571lM4127synchronized = m4127synchronized(size);
        }
        C2525l c2525l = this.Signature;
        if (c2525l != null) {
            c2525l.loadAd();
        }
        C2525l c2525l2 = new C2525l(new C17699l(this, size, 1));
        this.Signature = c2525l2;
        C16774l c16774lAmazon = C16774l.amazon(new C12402l(), size);
        c16774lAmazon.loadAd.f19550l = 1;
        c16774lAmazon.loadAd(c5571lM4127synchronized, C15421l.amazon, -1);
        c16774lAmazon.billing = c2525l2;
        return c16774lAmazon;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final C5571l m4127synchronized(Size size) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        C5571l c5571l = this.license;
        if (c5571l != null) {
            c5571l.yandex();
        }
        C5571l c5571l2 = new C5571l(surface, size, this.admob.firebase());
        this.license = c5571l2;
        AbstractC11356l.admob(c5571l2.purchase).yandex(new RunnableC12388l(surface, surfaceTexture, 28), AbstractC12272l.yandex());
        return c5571l2;
    }
}
