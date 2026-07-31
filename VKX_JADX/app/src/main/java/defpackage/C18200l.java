package defpackage;

import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: l٘ۛٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18200l extends AbstractC12329l implements InterfaceC5465l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35645l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18200l(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.f35645l = i2;
    }

    @Override // defpackage.InterfaceC4469l, defpackage.InterfaceC2463l
    public final InterfaceC16345l amazon() {
        return ((InterfaceC5465l) mo965synchronized()).amazon();
    }

    @Override // defpackage.InterfaceC13922l, defpackage.InterfaceC2901l
    public final InterfaceC1367l crashlytics() {
        return ((InterfaceC5465l) mo965synchronized()).crashlytics();
    }

    @Override // defpackage.InterfaceC2901l
    public final Object get() {
        int i = this.f35645l;
        Object obj = this.f26698l;
        switch (i) {
            case 0:
                return Boolean.valueOf(((C8410l) obj).amazon);
            case 1:
                return ((PlaybackService) obj).f36843l;
            case 2:
                return Boolean.valueOf(((C3972l) obj).f8159l);
            default:
                return ((InterfaceC8714l) obj).getValue();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    @Override // defpackage.AbstractC13674l
    public final InterfaceC6902l pro() {
        return AbstractC18202l.yandex.purchase(this);
    }
}
