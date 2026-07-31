package androidx.car.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.util.Log;
import androidx.car.app.CarAppMetadataHolderService;
import androidx.car.app.hardware.ProjectedCarHardwareManager;
import androidx.car.app.isPro;
import androidx.car.app.loadAd;
import androidx.car.app.subs;
import defpackage.AbstractC14814l;
import defpackage.AbstractC9859l;
import defpackage.C11040l;
import defpackage.C11644l;
import defpackage.C12809l;
import defpackage.C15064l;
import defpackage.C15891l;
import defpackage.C16390l;
import defpackage.C17568l;
import defpackage.C18047l;
import defpackage.C4437l;
import defpackage.C5268l;
import defpackage.C8339l;
import defpackage.InterfaceC10470l;
import defpackage.InterfaceC10744l;
import defpackage.InterfaceC8798l;
import defpackage.RunnableC16112l;
import j$.util.Objects;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class subs extends ContextWrapper {
    public int amazon;
    public final C11644l crashlytics;
    public final isPro loadAd;
    public final C16390l yandex;

    public subs(final C5268l c5268l, final isPro ispro) {
        super(null);
        C11644l c11644l = new C11644l(22);
        this.crashlytics = c11644l;
        final int i = 0;
        this.amazon = 0;
        this.loadAd = ispro;
        c11644l.m3169l(loadAd.class, "app", new InterfaceC10470l(this) { // from class: lٗۖؖ
            public final /* synthetic */ subs loadAd;

            {
                this.loadAd = this;
            }

            @Override // defpackage.InterfaceC10470l
            public final InterfaceC10744l yandex() {
                int i2 = i;
                C5268l c5268l2 = c5268l;
                isPro ispro2 = ispro;
                subs subsVar = this.loadAd;
                switch (i2) {
                    case 0:
                        return new loadAd(subsVar, ispro2, c5268l2);
                    default:
                        return new androidx.car.app.navigation.loadAd(subsVar, ispro2, c5268l2);
                }
            }
        });
        final int i2 = 1;
        c11644l.m3169l(androidx.car.app.navigation.loadAd.class, "navigation", new InterfaceC10470l(this) { // from class: lٗۖؖ
            public final /* synthetic */ subs loadAd;

            {
                this.loadAd = this;
            }

            @Override // defpackage.InterfaceC10470l
            public final InterfaceC10744l yandex() {
                int i3 = i2;
                C5268l c5268l2 = c5268l;
                isPro ispro2 = ispro;
                subs subsVar = this.loadAd;
                switch (i3) {
                    case 0:
                        return new loadAd(subsVar, ispro2, c5268l2);
                    default:
                        return new androidx.car.app.navigation.loadAd(subsVar, ispro2, c5268l2);
                }
            }
        });
        c11644l.m3169l(C17568l.class, "screen", new InterfaceC10470l(this) { // from class: lٌٕۖ
            public final /* synthetic */ subs loadAd;

            {
                this.loadAd = this;
            }

            @Override // defpackage.InterfaceC10470l
            public final InterfaceC10744l yandex() {
                int i3 = i;
                Object obj = c5268l;
                subs subsVar = this.loadAd;
                switch (i3) {
                    case 0:
                        return new C17568l(subsVar, (C5268l) obj);
                    default:
                        isPro ispro2 = (isPro) obj;
                        int i4 = subsVar.amazon;
                        if (i4 == 0) {
                            C8339l.smaato("Car App API level hasn't been established yet");
                            return null;
                        }
                        if (i4 < 3) {
                            throw new C15277l("Create CarHardwareManager failed", new IllegalArgumentException("Attempted to retrieve CarHardwareManager service, but the host is less than 3"));
                        }
                        try {
                            int i5 = CarAppMetadataHolderService.f275l;
                            Bundle bundle = subsVar.getPackageManager().getServiceInfo(new ComponentName(subsVar, (Class<?>) CarAppMetadataHolderService.class), 640).metaData;
                            String string = bundle != null ? bundle.getString("androidx.car.app.CarAppMetadataHolderService.CAR_HARDWARE_MANAGER") : null;
                            if (string != null) {
                                return (ProjectedCarHardwareManager) Class.forName(string).getConstructor(subs.class, isPro.class).newInstance(subsVar, ispro2);
                            }
                            throw new ClassNotFoundException("CarHardwareManager metadata could not be found");
                        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
                            C8339l.smaato("CarHardwareManager not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
                            return null;
                        }
                }
            }
        });
        c11644l.m3169l(C15064l.class, "constraints", new C12809l());
        c11644l.m3169l(ProjectedCarHardwareManager.class, "hardware", new InterfaceC10470l(this) { // from class: lٌٕۖ
            public final /* synthetic */ subs loadAd;

            {
                this.loadAd = this;
            }

            @Override // defpackage.InterfaceC10470l
            public final InterfaceC10744l yandex() {
                int i3 = i2;
                Object obj = ispro;
                subs subsVar = this.loadAd;
                switch (i3) {
                    case 0:
                        return new C17568l(subsVar, (C5268l) obj);
                    default:
                        isPro ispro2 = (isPro) obj;
                        int i4 = subsVar.amazon;
                        if (i4 == 0) {
                            C8339l.smaato("Car App API level hasn't been established yet");
                            return null;
                        }
                        if (i4 < 3) {
                            throw new C15277l("Create CarHardwareManager failed", new IllegalArgumentException("Attempted to retrieve CarHardwareManager service, but the host is less than 3"));
                        }
                        try {
                            int i5 = CarAppMetadataHolderService.f275l;
                            Bundle bundle = subsVar.getPackageManager().getServiceInfo(new ComponentName(subsVar, (Class<?>) CarAppMetadataHolderService.class), 640).metaData;
                            String string = bundle != null ? bundle.getString("androidx.car.app.CarAppMetadataHolderService.CAR_HARDWARE_MANAGER") : null;
                            if (string != null) {
                                return (ProjectedCarHardwareManager) Class.forName(string).getConstructor(subs.class, isPro.class).newInstance(subsVar, ispro2);
                            }
                            throw new ClassNotFoundException("CarHardwareManager metadata could not be found");
                        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
                            C8339l.smaato("CarHardwareManager not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
                            return null;
                        }
                }
            }
        });
        c11644l.m3169l(InterfaceC8798l.class, null, new C11040l(this));
        c11644l.m3169l(C15891l.class, "suggestion", new C11040l(this, ispro, c5268l, i));
        c11644l.m3169l(C18047l.class, "media_playback", new C11040l(this, ispro, c5268l, i2));
        this.yandex = new C16390l(new RunnableC16112l(14, this));
        c5268l.yandex(new C4437l(i, ispro));
    }

    public final void crashlytics(Configuration configuration) {
        AbstractC9859l.yandex();
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "Car configuration changed, configuration: " + configuration + ", displayMetrics: " + getResources().getDisplayMetrics());
        }
        Resources resources = getResources();
        Objects.requireNonNull(configuration);
        resources.updateConfiguration(configuration, getResources().getDisplayMetrics());
    }

    public final InterfaceC10744l loadAd(Class cls) {
        C11644l c11644l = this.crashlytics;
        HashMap map = (HashMap) c11644l.f23358l;
        HashMap map2 = (HashMap) c11644l.f23357l;
        RuntimeException runtimeException = (RuntimeException) map2.get(cls);
        if (runtimeException != null) {
            throw runtimeException;
        }
        InterfaceC10744l interfaceC10744l = (InterfaceC10744l) map.get(cls);
        if (interfaceC10744l != null) {
            return interfaceC10744l;
        }
        InterfaceC10470l interfaceC10470l = (InterfaceC10470l) ((HashMap) c11644l.f23361l).get(cls);
        if (interfaceC10470l == null) {
            C8339l.metrica(AbstractC14814l.metrica(cls, "The class '", "' does not correspond to a car service"));
            return null;
        }
        try {
            InterfaceC10744l interfaceC10744lYandex = interfaceC10470l.yandex();
            map.put(cls, interfaceC10744lYandex);
            return interfaceC10744lYandex;
        } catch (RuntimeException e) {
            map2.put(cls, e);
            throw e;
        }
    }

    public final void yandex(Context context, Configuration configuration) {
        AbstractC9859l.yandex();
        if (getBaseContext() == null) {
            Object systemService = context.getSystemService("display");
            Objects.requireNonNull(systemService);
            attachBaseContext(context.createDisplayContext(((DisplayManager) systemService).createVirtualDisplay("CarAppService", configuration.screenWidthDp, configuration.screenHeightDp, configuration.densityDpi, null, 8).getDisplay()).createConfigurationContext(configuration));
        }
        crashlytics(configuration);
    }
}
