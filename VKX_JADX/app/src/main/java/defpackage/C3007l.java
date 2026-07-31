package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lؔۤؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3007l implements InterfaceC18528l {
    public final /* synthetic */ int yandex;

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        switch (this.yandex) {
            case 0:
                throw new C4726l("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
                interfaceC14185l.yandex(C2694l.mopub, entry.getKey());
                interfaceC14185l.yandex(C2694l.admob, entry.getValue());
                return;
            default:
                throw new C4726l("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
