package defpackage;

import java.io.IOException;
import kotlin.Unit;

/* JADX INFO: renamed from: lؘٖۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16220l extends C9685l implements InterfaceC12316l {
    @Override // defpackage.InterfaceC12316l
    public final Object loadAd(InterfaceC14029l interfaceC14029l, Object obj) throws IOException {
        InterfaceC14029l interfaceC14029l2 = null;
        if (this.crashlytics.get()) {
            C8339l.smaato("This scope has already been closed.");
            return null;
        }
        Object objCrashlytics = AbstractC14775l.crashlytics(this.yandex, new C7045l(this, obj, interfaceC14029l2, 2), (AbstractC0283l) interfaceC14029l);
        return objCrashlytics == EnumC9342l.f19165l ? objCrashlytics : Unit.INSTANCE;
    }
}
