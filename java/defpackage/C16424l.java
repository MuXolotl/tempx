package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٖٗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16424l implements InterfaceC2889l {
    public boolean amazon;
    public C6344l billing;
    public C5571l mopub;
    public final boolean purchase;
    public final InterfaceC5389l yandex;
    public final C8688l loadAd = new C8688l(new C13932l(17, this));
    public final C5620l crashlytics = new C5620l(3, new C11586l());

    public C16424l(C15736l c15736l) {
        this.yandex = c15736l.loadAd;
        this.purchase = AbstractC17919l.yandex(ZslDisablerQuirk.class) != null;
    }

    @Override // defpackage.InterfaceC2889l
    public final void amazon(boolean z) throws Exception {
        if (this.amazon != z && z) {
            while (true) {
                C5620l c5620l = this.crashlytics;
                if (c5620l.m4284else()) {
                    break;
                } else {
                    ((InterfaceC11792l) c5620l.license()).close();
                }
            }
        }
        this.amazon = z;
    }

    public final void billing() throws Exception {
        C5571l c5571l = this.mopub;
        if (c5571l != null) {
            C6344l c6344l = this.billing;
            if (c6344l != null) {
                AbstractC11356l.admob(c5571l.purchase).yandex(new RunnableC9090l(c6344l, 4), AbstractC12272l.admob());
                c6344l.startapp();
                this.billing = null;
            }
            c5571l.yandex();
            this.mopub = null;
        }
        while (true) {
            C5620l c5620l = this.crashlytics;
            if (c5620l.m4284else()) {
                return;
            } else {
                ((InterfaceC11792l) c5620l.license()).close();
            }
        }
    }

    @Override // defpackage.InterfaceC2889l
    public final void loadAd(C16774l c16774l) throws Exception {
        C9598l c9598l = c16774l.loadAd;
        billing();
        if (this.amazon) {
            c9598l.f19550l = 1;
            return;
        }
        if (this.purchase) {
            c9598l.f19550l = 1;
            return;
        }
        InterfaceC5389l.admob.getClass();
        int[] iArr = (int[]) ((C10861l) this.yandex).crashlytics(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr == null) {
            iArr = C11905l.loadAd;
        }
        if (!AbstractC8669l.tapsense(iArr, 4)) {
            if (AbstractC5088l.remoteconfig()) {
                Log.i("CXCP", "ZslControlImpl: Private reprocessing isn't supported");
            }
            c9598l.f19550l = 1;
            return;
        }
        C8688l c8688l = this.loadAd;
        Iterator it = AbstractC8669l.m2415super(((StreamConfigurationMap) c8688l.getValue()).getInputSizes(34)).iterator();
        if (!it.hasNext()) {
            C4875l.firebase();
            return;
        }
        Object next = it.next();
        if (it.hasNext()) {
            Size size = (Size) next;
            int height = size.getHeight() * size.getWidth();
            do {
                Object next2 = it.next();
                Size size2 = (Size) next2;
                int height2 = size2.getHeight() * size2.getWidth();
                if (height < height2) {
                    next = next2;
                    height = height2;
                }
            } while (it.hasNext());
        }
        Size size3 = (Size) next;
        if (size3 == null) {
            if (AbstractC5088l.metrica()) {
                Log.w("CXCP", "ZslControlImpl: Unable to find a supported size for ZSL");
                return;
            }
            return;
        }
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "ZslControlImpl: Selected ZSL size: " + size3);
        }
        if (!AbstractC8669l.tapsense(((StreamConfigurationMap) c8688l.getValue()).getValidOutputFormatsForInput(34), PSKKeyManager.MAX_KEY_LENGTH_BYTES)) {
            if (AbstractC5088l.metrica()) {
                Log.w("CXCP", "ZslControlImpl: JPEG isn't valid output for ZSL format");
                return;
            }
            return;
        }
        C9723l c9723l = new C9723l(size3.getWidth(), size3.getHeight(), 34, 9);
        C6344l c6344l = new C6344l(c9723l);
        c9723l.premium(new C4568l(21, this), AbstractC12272l.mopub());
        Surface surface = c6344l.getSurface();
        if (surface == null) {
            C8339l.smaato("Required value was null.");
            return;
        }
        C5571l c5571l = new C5571l(surface, new Size(c6344l.purchase(), c6344l.loadAd()), 34);
        AbstractC11356l.admob(c5571l.purchase).yandex(new RunnableC9090l(c6344l, 3), AbstractC12272l.admob());
        c16774l.loadAd(c5571l, C15421l.amazon, -1);
        C16815l c16815l = c9723l.f19828l;
        c9598l.tapsense(c16815l);
        ArrayList arrayList = c16774l.purchase;
        if (!arrayList.contains(c16815l)) {
            arrayList.add(c16815l);
        }
        c16774l.mopub = new InputConfiguration(c6344l.purchase(), c6344l.loadAd(), c6344l.metrica());
        this.billing = c6344l;
        this.mopub = c5571l;
    }

    @Override // defpackage.InterfaceC2889l
    public final boolean purchase(AbstractC0958l abstractC0958l, C10814l c10814l) {
        Size size = abstractC0958l.admob;
        InputConfiguration inputConfiguration = c10814l.subs;
        return inputConfiguration != null && abstractC0958l.subs == inputConfiguration.getFormat() && size.getWidth() == inputConfiguration.getWidth() && size.getHeight() == inputConfiguration.getHeight();
    }

    @Override // defpackage.InterfaceC2889l
    public final void yandex() throws Exception {
        billing();
    }

    @Override // defpackage.InterfaceC2889l
    public final void crashlytics(boolean z) {
    }
}
