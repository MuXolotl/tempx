package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lؙٚؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6560l implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ String f13691l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C0228l f13692l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13693l;

    public /* synthetic */ C6560l(C0228l c0228l, String str, int i) {
        this.f13693l = i;
        this.f13692l = c0228l;
        this.f13691l = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f13693l;
        String str = this.f13691l;
        C0228l c0228l = this.f13692l;
        switch (i) {
            case 0:
                c0228l.f1205l.put(str, EnumC11199l.f22554l);
                c0228l.advert();
                break;
            default:
                C12376l c12376l = c0228l.f1205l;
                if (c12376l.get(str) == EnumC11199l.f22551l) {
                    c12376l.remove(str);
                    InterfaceC13238l interfaceC13238lIsVip = c0228l.isVip();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : interfaceC13238lIsVip) {
                        AudioTrack audioTrack = (AudioTrack) obj;
                        audioTrack.getClass();
                        if (!AbstractC16676l.mopub(audioTrack).equals(str)) {
                            arrayList.add(obj);
                        }
                    }
                    c0228l.f1199l.setValue(AbstractC0509l.purchase(arrayList));
                } else {
                    c12376l.put(str, EnumC11199l.f22550l);
                }
                c0228l.advert();
                break;
        }
        return Unit.INSTANCE;
    }
}
