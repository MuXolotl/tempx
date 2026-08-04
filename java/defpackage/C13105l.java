package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: lْؔۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13105l extends AbstractC1124l {
    public final /* synthetic */ Object amazon;
    public final /* synthetic */ int crashlytics;

    public /* synthetic */ C13105l(int i, Object obj) {
        this.crashlytics = i;
        this.amazon = obj;
    }

    @Override // defpackage.AbstractC1124l
    public final AbstractC4946l mopub(InterfaceC1925l interfaceC1925l) {
        int i = this.crashlytics;
        Object obj = this.amazon;
        switch (i) {
            case 0:
                if (((ArrayList) obj).contains(interfaceC1925l)) {
                    return AbstractC12008l.isPro((InterfaceC16902l) interfaceC1925l.pro());
                }
                return null;
            default:
                return (AbstractC4946l) ((Map) obj).get(interfaceC1925l);
        }
    }

    @Override // defpackage.AbstractC10794l
    public boolean purchase() {
        switch (this.crashlytics) {
            case 1:
                return ((Map) this.amazon).isEmpty();
            default:
                return super.purchase();
        }
    }

    @Override // defpackage.AbstractC10794l
    public boolean yandex() {
        switch (this.crashlytics) {
            case 1:
                return false;
            default:
                return super.yandex();
        }
    }
}
