package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٗۜۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17426l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5097l f33960l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f33961l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33962l = 0;

    public /* synthetic */ C17426l(AbstractC5097l abstractC5097l, AppActivity appActivity) {
        this.f33960l = abstractC5097l;
        this.f33961l = appActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f33962l;
        AbstractC5097l abstractC5097l = this.f33960l;
        AppActivity appActivity = this.f33961l;
        C6956l c6956l = (C6956l) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC7876l.yandex((C0764l) abstractC5097l.f11108l.crashlytics.getValue(), AbstractC14566l.amazon(-1387840143, new C17426l(appActivity, abstractC5097l), c6956l), c6956l, 48, 0);
                } else {
                    c6956l.m2124else();
                }
                break;
            default:
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC10478l.loadAd(new C10092l[]{AbstractC12504l.yandex.yandex(appActivity), AbstractC18678l.yandex.yandex(abstractC5097l.f11108l), AbstractC2431l.yandex.yandex(abstractC5097l)}, AbstractC14566l.amazon(-2015309263, new C15707l(13, abstractC5097l), c6956l), c6956l, 56);
                } else {
                    c6956l.m2124else();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C17426l(AppActivity appActivity, AbstractC5097l abstractC5097l) {
        this.f33961l = appActivity;
        this.f33960l = abstractC5097l;
    }
}
