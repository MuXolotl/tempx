package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* JADX INFO: renamed from: lؒۤؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1446l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C0228l f3629l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C16307l f3630l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3631l = 0;

    public /* synthetic */ C1446l(C0228l c0228l, C16307l c16307l) {
        this.f3629l = c0228l;
        this.f3630l = c16307l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Exception {
        AudioPlaylist audioPlaylist;
        int i = this.f3631l;
        C0228l c0228l = this.f3629l;
        C16307l c16307l = this.f3630l;
        switch (i) {
            case 0:
                if (((C14115l) c0228l.f1208l.getValue()) == null && ((audioPlaylist = c0228l.f1204l) == null || audioPlaylist.Signature == null)) {
                    c16307l.amazon(AbstractC17828l.yandex());
                } else {
                    c0228l.f1200l.setValue(Boolean.TRUE);
                }
                break;
            default:
                c16307l.amazon(AbstractC17828l.yandex());
                c0228l.f1200l.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C1446l(C16307l c16307l, C0228l c0228l) {
        this.f3630l = c16307l;
        this.f3629l = c0228l;
    }
}
