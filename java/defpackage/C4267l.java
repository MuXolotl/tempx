package defpackage;

import java.util.Map;

/* JADX INFO: renamed from: lٟؖٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4267l implements InterfaceC18528l {
    public final /* synthetic */ int yandex;
    public static final /* synthetic */ C4267l loadAd = new C4267l(0);
    public static final /* synthetic */ C4267l crashlytics = new C4267l(1);

    public /* synthetic */ C4267l(int i) {
        this.yandex = i;
    }

    @Override // defpackage.InterfaceC7349l
    public final void yandex(Object obj, Object obj2) {
        switch (this.yandex) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                InterfaceC14185l interfaceC14185l = (InterfaceC14185l) obj2;
                interfaceC14185l.yandex(C4318l.mopub, entry.getKey());
                interfaceC14185l.yandex(C4318l.admob, entry.getValue());
                return;
            case 1:
                throw new C4726l("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                InterfaceC14185l interfaceC14185l2 = (InterfaceC14185l) obj2;
                interfaceC14185l2.yandex(C6455l.mopub, entry2.getKey());
                interfaceC14185l2.yandex(C6455l.admob, entry2.getValue());
                return;
            default:
                throw new C4726l("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
