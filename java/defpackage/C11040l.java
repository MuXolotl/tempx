package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.car.app.CarAppMetadataHolderService;
import androidx.car.app.isPro;
import androidx.car.app.subs;

/* JADX INFO: renamed from: lُٕٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11040l implements InterfaceC10470l {
    public final /* synthetic */ Object loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C11040l(subs subsVar) {
        this.yandex = 2;
        this.loadAd = subsVar;
    }

    @Override // defpackage.InterfaceC10470l
    public final InterfaceC10744l yandex() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                C5268l c5268l = (C5268l) obj;
                C15891l c15891l = new C15891l();
                c5268l.yandex(new C4088l(c5268l, 2));
                return c15891l;
            case 1:
                C5268l c5268l2 = (C5268l) obj;
                C18047l c18047l = new C18047l();
                c5268l2.yandex(new C4088l(c5268l2, 0));
                return c18047l;
            default:
                subs subsVar = (subs) obj;
                try {
                    int i2 = CarAppMetadataHolderService.f275l;
                    Bundle bundle = subsVar.getPackageManager().getServiceInfo(new ComponentName(subsVar, (Class<?>) CarAppMetadataHolderService.class), 640).metaData;
                    String string = bundle != null ? bundle.getString("androidx.car.app.CarAppMetadataHolderService.RESULT_MANAGER") : null;
                    if (string == null) {
                        throw new ClassNotFoundException("ResultManager metadata could not be found");
                    }
                    if (Class.forName(string).getConstructor(null).newInstance(null) == null) {
                        return null;
                    }
                    throw new ClassCastException();
                } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
                    C8339l.smaato("ResultManager not configured. Did you forget to add a dependency on the app-automotive artifact?");
                }
                break;
        }
    }

    public /* synthetic */ C11040l(subs subsVar, isPro ispro, C5268l c5268l, int i) {
        this.yandex = i;
        this.loadAd = c5268l;
    }
}
