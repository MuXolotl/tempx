package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: renamed from: lؙٗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16950l extends View {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C12455l f33060l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Window f33061l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public AbstractC2786l f33062l;

    private float getBrightness() {
        Window window = this.f33061l;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        AbstractC5088l.crashlytics("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.f33061l == null) {
            AbstractC5088l.crashlytics("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f)) {
            AbstractC5088l.crashlytics("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.f33061l.getAttributes();
        attributes.screenBrightness = f;
        this.f33061l.setAttributes(attributes);
        AbstractC5088l.yandex("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(InterfaceC2406l interfaceC2406l) {
        AbstractC2786l abstractC2786l = this.f33062l;
        if (abstractC2786l == null) {
            AbstractC5088l.yandex("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
            return;
        }
        EnumC17323l enumC17323l = EnumC17323l.f33634l;
        C4738l c4738l = new C4738l(enumC17323l, interfaceC2406l);
        C4738l c4738lAdmob = abstractC2786l.admob();
        abstractC2786l.appmetrica.put(enumC17323l, c4738l);
        C4738l c4738lAdmob2 = abstractC2786l.admob();
        if (c4738lAdmob2 == null || c4738lAdmob2.equals(c4738lAdmob)) {
            return;
        }
        abstractC2786l.startapp();
    }

    public InterfaceC2406l getScreenFlash() {
        return this.f33060l;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(AbstractC2786l abstractC2786l) {
        AbstractC12225l.crashlytics();
        AbstractC2786l abstractC2786l2 = this.f33062l;
        if (abstractC2786l2 != null && abstractC2786l2 != abstractC2786l) {
            setScreenFlashUiInfo(null);
        }
        this.f33062l = abstractC2786l;
        if (abstractC2786l == null) {
            return;
        }
        AbstractC12225l.crashlytics();
        if (abstractC2786l.amazon.m2730volatile() == 3 && this.f33061l == null) {
            C8339l.smaato("No window set despite setting FLASH_MODE_SCREEN in CameraController");
        } else {
            setScreenFlashUiInfo(getScreenFlash());
        }
    }

    public void setScreenFlashWindow(Window window) {
        AbstractC12225l.crashlytics();
        StringBuilder sb = new StringBuilder("updateScreenFlash: is new window null = ");
        sb.append(window == null);
        sb.append(",  is new window same as previous = ");
        sb.append(window == this.f33061l);
        AbstractC5088l.yandex("ScreenFlashView", sb.toString());
        if (this.f33061l != window) {
            this.f33060l = window == null ? null : new C12455l(this);
        }
        this.f33061l = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
