package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: lُْؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13283l {
    public static volatile C13283l firebase;
    public volatile Display[] amazon;
    public volatile Size billing;
    public final DisplayManager purchase;
    public static final C6096l mopub = new C6096l(0);
    public static final Size admob = new Size(1920, 1080);
    public static final Size subs = new Size(320, 240);
    public static final Size isPro = new Size(640, 480);
    public final C3316l yandex = new C3316l(14);
    public final C3316l loadAd = new C3316l(9);
    public final Object crashlytics = new Object();

    public C13283l(Context context) {
        C0111l c0111l = new C0111l(0, this);
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayManager.registerDisplayListener(c0111l, new Handler(Looper.getMainLooper()));
        this.purchase = displayManager;
    }

    public final Size crashlytics() {
        synchronized (this.crashlytics) {
            if (this.billing != null) {
                return this.billing;
            }
            this.billing = yandex();
            return this.billing;
        }
    }

    public final Display loadAd(boolean z) {
        Display[] displays;
        int i;
        synchronized (this.crashlytics) {
            displays = this.amazon;
            if (displays == null) {
                displays = this.purchase.getDisplays();
                this.amazon = displays;
            }
        }
        if (displays.length == 1) {
            return displays[0];
        }
        int i2 = -1;
        int i3 = -1;
        Display display = null;
        Display display2 = null;
        for (Display display3 : displays) {
            Point point = new Point();
            display3.getRealSize(point);
            int i4 = point.x * point.y;
            if (i4 > i2) {
                display = display3;
                i2 = i4;
            }
            if (display3.getState() != 1 && (i = point.x * point.y) > i3) {
                display2 = display3;
                i3 = i;
            }
        }
        if (z && display2 != null) {
            display = display2;
        }
        if (display != null) {
            return display;
        }
        C17132l.smaato(33, Arrays.toString(displays), "No displays found from ");
        return null;
    }

    public final Size yandex() {
        Size sizeAmazon;
        Point point = new Point();
        loadAd(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (AbstractC5513l.yandex(size) < AbstractC5513l.yandex(subs)) {
            Size size2 = ((SmallDisplaySizeQuirk) this.loadAd.f7072l) != null ? (Size) SmallDisplaySizeQuirk.yandex.get(Build.MODEL.toUpperCase(Locale.ROOT)) : null;
            if (size2 == null) {
                size2 = isPro;
            }
            size = size2;
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        Size size3 = admob;
        if (AbstractC5513l.yandex(size3) < AbstractC5513l.yandex(size)) {
            size = size3;
        }
        if (((ExtraCroppingQuirk) this.yandex.f7072l) != null && (sizeAmazon = ExtraCroppingQuirk.amazon(EnumC13290l.f26074l)) != null) {
            if (sizeAmazon.getHeight() * sizeAmazon.getWidth() > size.getHeight() * size.getWidth()) {
                return sizeAmazon;
            }
        }
        return size;
    }
}
