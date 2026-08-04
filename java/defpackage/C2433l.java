package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lًؘؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2433l implements InterfaceC3335l {
    public final Object loadAd;
    public final /* synthetic */ int yandex;

    public C2433l(C18396l c18396l) {
        this.yandex = 1;
        this.loadAd = new LinkedHashSet();
        c18396l.m4528synchronized("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.InterfaceC3335l
    public final Bundle yandex() {
        int i = this.yandex;
        Object obj = this.loadAd;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((AppActivity) obj).remoteconfig().getClass();
                return bundle;
            default:
                Bundle bundleLoadAd = AbstractC1315l.loadAd((C8195l[]) Arrays.copyOf(new C8195l[0], 0));
                List listM4213const = AbstractC16901l.m4213const((LinkedHashSet) obj);
                bundleLoadAd.putStringArrayList("classes_to_restore", listM4213const instanceof ArrayList ? (ArrayList) listM4213const : new ArrayList<>(listM4213const));
                return bundleLoadAd;
        }
    }

    public C2433l(AppActivity appActivity) {
        this.yandex = 0;
        this.loadAd = appActivity;
    }
}
