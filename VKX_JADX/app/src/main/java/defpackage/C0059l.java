package defpackage;

import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lؑؓۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0059l extends AbstractC13761l implements InterfaceC2901l {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f959l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0059l(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.f959l = i2;
    }

    @Override // defpackage.InterfaceC13922l, defpackage.InterfaceC2901l
    public final InterfaceC1367l crashlytics() {
        return ((InterfaceC2901l) mo965synchronized()).crashlytics();
    }

    @Override // defpackage.InterfaceC2901l
    public final Object get() {
        int i = this.f959l;
        Object obj = this.f26698l;
        switch (i) {
            case 0:
                return Integer.valueOf(((C12362l) obj).billing.admob());
            case 1:
                return Integer.valueOf(((C12362l) obj).mopub.admob());
            case 2:
                return ((C13046l) obj).smaato;
            case 3:
                return ((C13046l) obj).smaato;
            case 4:
                return ((InterfaceC12244l) obj).getValue();
            case 5:
                return ((InterfaceC12244l) obj).getValue();
            case 6:
                return ((InterfaceC12244l) obj).getValue();
            case 7:
                return ((InterfaceC12244l) obj).getValue();
            case 8:
                return obj.getClass().getSimpleName();
            case 9:
                return ((C16076l) obj).f31511l;
            case 10:
                int i2 = PlaybackService.f36828l;
                ((PlaybackService) obj).getClass();
                return PlaybackService.license();
            case 11:
                int i3 = PlaybackService.f36828l;
                ((PlaybackService) obj).getClass();
                return PlaybackService.license().f31521l;
            case 12:
                return ((InterfaceC12244l) obj).getValue();
            case 13:
                return Float.valueOf(((Number) ((C8998l) obj).f18553l.getValue()).floatValue());
            default:
                return ((C9135l) obj).f18785l;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    @Override // defpackage.AbstractC13674l
    public final InterfaceC6902l pro() {
        return AbstractC18202l.yandex.mopub(this);
    }
}
