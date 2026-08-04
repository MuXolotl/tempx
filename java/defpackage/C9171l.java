package defpackage;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌۥٕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9171l implements InterfaceC0844l {
    public final Bundle yandex;

    public C9171l(Context context) {
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.yandex = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // defpackage.InterfaceC0844l
    public final Double amazon() {
        Bundle bundle = this.yandex;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // defpackage.InterfaceC0844l
    public final C9658l crashlytics() {
        Bundle bundle = this.yandex;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new C9658l(AbstractC15918l.tapsense(bundle.getInt("firebase_sessions_sessions_restart_timeout"), EnumC16636l.SECONDS));
        }
        return null;
    }

    @Override // defpackage.InterfaceC0844l
    public final Object loadAd(InterfaceC14029l interfaceC14029l) {
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC0844l
    public final Boolean yandex() {
        Bundle bundle = this.yandex;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }
}
