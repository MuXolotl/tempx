package defpackage;

import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: renamed from: lْٔؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14861l implements InterfaceC5644l {
    public final /* synthetic */ C10226l loadAd;
    public final /* synthetic */ Type yandex;

    public C14861l(Type type, C10226l c10226l) {
        this.yandex = type;
        this.loadAd = c10226l;
    }

    @Override // defpackage.InterfaceC5644l
    public final AbstractC7188l yandex(Type type, Set set, C12952l c12952l) {
        if (!set.isEmpty()) {
            return null;
        }
        Set set2 = AbstractC7694l.yandex;
        if (AbstractC15639l.crashlytics(this.yandex, type)) {
            return this.loadAd;
        }
        return null;
    }
}
