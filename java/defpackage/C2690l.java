package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: renamed from: lؔ٘ٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2690l {
    public final HashMap crashlytics;
    public final C10111l loadAd;
    public final C18396l yandex;

    public C2690l(Context context, C10111l c10111l) {
        C18396l c18396l = new C18396l(context);
        this.crashlytics = new HashMap();
        this.yandex = c18396l;
        this.loadAd = c10111l;
    }

    public final synchronized InterfaceC9691l yandex(String str) {
        if (this.crashlytics.containsKey(str)) {
            return (InterfaceC9691l) this.crashlytics.get(str);
        }
        CctBackendFactory cctBackendFactoryAd = this.yandex.ad(str);
        if (cctBackendFactoryAd == null) {
            return null;
        }
        C10111l c10111l = this.loadAd;
        InterfaceC9691l interfaceC9691lCreate = cctBackendFactoryAd.create(new C12795l((Context) c10111l.f20587l, (InterfaceC4701l) c10111l.f20586l, (InterfaceC4701l) c10111l.f20589l, str));
        this.crashlytics.put(str, interfaceC9691lCreate);
        return interfaceC9691lCreate;
    }
}
