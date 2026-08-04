package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: lُۘۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11280l implements InterfaceC18560l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f22717l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final boolean f22718l;

    public C11280l(C17735l c17735l) {
        boolean z;
        Iterator it = c17735l.crashlytics(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).crashlytics()) {
                z = true;
                this.f22718l = z;
                this.f22717l = c17735l.yandex(ImageCaptureFailedForVideoSnapshotQuirk.class);
            }
        }
        z = false;
        this.f22718l = z;
        this.f22717l = c17735l.yandex(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    @Override // defpackage.InterfaceC18560l
    public Map crashlytics(C18221l c18221l) {
        if (c18221l != null && c18221l.yandex == 3 && this.f22718l) {
            return Collections.singletonMap(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
        }
        return (c18221l != null && c18221l.yandex == 4 && this.f22717l) ? Collections.singletonMap(CaptureRequest.CONTROL_CAPTURE_INTENT, 2) : C14054l.f27396l;
    }

    public C11280l(boolean z, boolean z2) {
        this.f22718l = z;
        this.f22717l = z2;
    }
}
