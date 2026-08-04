package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedList;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lؑٛٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C0431l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C8706l f1565l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0431l(C8706l c8706l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f1565l = c8706l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        AbstractC2829l.crashlytics(obj);
        C8706l c8706l = this.f1565l;
        AbstractC14412l abstractC14412l = c8706l.f5279l;
        if (abstractC14412l == null) {
            abstractC14412l = null;
        }
        C12375l c12375l = (C12375l) abstractC14412l;
        String strLoadAd = c8706l.f17913l;
        if (strLoadAd == null) {
            VKXApplication.Companion companion = VKXApplication.f36628l;
            strLoadAd = VKXApplication.Companion.loadAd(R.string.acc_news);
        }
        C10227l c10227lAdmob = AbstractC14055l.admob();
        VKXApplication.Companion companion2 = VKXApplication.f36628l;
        c10227lAdmob.add(new C12823l(VKXApplication.Companion.loadAd(R.string.acc_news), Boolean.valueOf(c8706l.f17906l == null), new C16184l(c8706l, 2)));
        List<NewsfeedList> list = c8706l.f17909l;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        for (NewsfeedList newsfeedList : list) {
            String str = newsfeedList.loadAd;
            Integer num = c8706l.f17906l;
            arrayList.add(new C12823l(str, Boolean.valueOf(num != null && num.intValue() == newsfeedList.yandex), new C8854l(c8706l, newsfeedList, 11)));
        }
        c10227lAdmob.addAll(arrayList);
        Unit unit = Unit.INSTANCE;
        C12375l.firebase(c12375l, strLoadAd, AbstractC14055l.purchase(c10227lAdmob));
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C0431l(this.f1565l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0431l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
