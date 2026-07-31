package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lؕۧؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3787l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7711l f7879l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f7880l;

    public /* synthetic */ C3787l(C7711l c7711l, int i) {
        this.f7880l = i;
        this.f7879l = c7711l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f7880l;
        int i2 = 1;
        int i3 = 2;
        int i4 = 0;
        C7711l c7711l = this.f7879l;
        switch (i) {
            case 0:
                C18480l c18480l = (C18480l) c7711l.f16189l.f21748l;
                ArrayList arrayList = (ArrayList) c18480l.f36087l;
                ArrayList arrayList2 = (ArrayList) c18480l.f36089l;
                if (((C14451l) c18480l.f36088l) != null) {
                    int iMin = Math.min(((Number) arrayList2.get(0)).intValue(), ((Number) arrayList2.get(1)).intValue());
                    int iMax = Math.max(((Number) arrayList2.get(0)).intValue(), ((Number) arrayList2.get(1)).intValue());
                    for (Object obj : ((C14451l) c18480l.f36088l).f28630l.billing.subList(iMin, iMax)) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            AbstractC14055l.subscription();
                            throw null;
                        }
                        AudioTrack audioTrack = (AudioTrack) obj;
                        if (!arrayList.contains(audioTrack)) {
                            arrayList.add(audioTrack);
                            arrayList2.add(Integer.valueOf(i4));
                        }
                        i4 = i5;
                    }
                    ((C14451l) c18480l.f36088l).f465l.amazon(iMin, iMax, null);
                    ((C7711l) c18480l.f36084l).m2200instanceof();
                }
                return Unit.INSTANCE;
            case 1:
                C10740l c10740l = c7711l.f16189l;
                if (c10740l != null) {
                    C18480l c18480l2 = (C18480l) c10740l.f21748l;
                    new C9231l(new ArrayList((ArrayList) c18480l2.f36087l)).Signature((AppActivity) c7711l.f34617l);
                    Unit unit = Unit.INSTANCE;
                    c18480l2.admob();
                }
                c7711l.m2197abstract();
                return Unit.INSTANCE;
            case 2:
                C10740l c10740l2 = c7711l.f16189l;
                if (c10740l2 != null) {
                    C18480l c18480l3 = (C18480l) c10740l2.f21748l;
                    ArrayList arrayList3 = new ArrayList((ArrayList) c18480l3.f36087l);
                    C16076l c16076l = VKXApplication.f36632l;
                    if (c16076l == null) {
                        c16076l = null;
                    }
                    c16076l.yandex(arrayList3, false);
                    Unit unit2 = Unit.INSTANCE;
                    c18480l3.admob();
                }
                AppActivity appActivity = (AppActivity) c7711l.isVip();
                Integer numValueOf = Integer.valueOf(R.drawable.ic_list_add_outline_28);
                VKXApplication vKXApplication = VKXApplication.f36631l;
                C6666l.yandex(appActivity, new C10734l(numValueOf, (vKXApplication != null ? vKXApplication : null).getString(R.string.play_next_ok), null, null, null, 212));
                c7711l.m2197abstract();
                return Unit.INSTANCE;
            case 3:
                C10740l c10740l3 = c7711l.f16189l;
                if (c10740l3 != null) {
                    C18480l c18480l4 = (C18480l) c10740l3.f21748l;
                    ArrayList arrayList4 = new ArrayList((ArrayList) c18480l4.f36087l);
                    C15478l c15478l = C15478l.purchase;
                    AppActivity appActivity2 = (AppActivity) c7711l.isVip();
                    StringBuilder sb = new StringBuilder();
                    C16287l.yandex.getClass();
                    sb.append(C16287l.crashlytics());
                    sb.append(arrayList4.hashCode());
                    C17050l c17050l = new C17050l(sb.toString(), "Мультивыбор", arrayList4);
                    c15478l.getClass();
                    C15478l.loadAd(appActivity2, c17050l);
                    Unit unit3 = Unit.INSTANCE;
                    c18480l4.admob();
                }
                c7711l.m2197abstract();
                return Unit.INSTANCE;
            case 4:
                C10740l c10740l4 = c7711l.f16189l;
                if (c10740l4 != null) {
                    C18480l c18480l5 = (C18480l) c10740l4.f21748l;
                    AbstractC11397l.mopub(c7711l.isVip(), new C13627l(2, new ArrayList((ArrayList) c18480l5.f36087l)));
                    Unit unit4 = Unit.INSTANCE;
                    c18480l5.admob();
                }
                c7711l.m2197abstract();
                return Unit.INSTANCE;
            case 5:
                C10740l c10740l5 = c7711l.f16189l;
                if (c10740l5 != null) {
                    C18480l c18480l6 = (C18480l) c10740l5.f21748l;
                    new C4228l(c7711l, i2).invoke(new ArrayList((ArrayList) c18480l6.f36087l));
                    c18480l6.admob();
                }
                c7711l.m2197abstract();
                return Unit.INSTANCE;
            case 6:
                AbstractC12832l.mopub(C3689l.yandex, AbstractC11738l.yandex(c7711l.f34614l));
                return Unit.INSTANCE;
            case 7:
                return new C11390l(c7711l.f16186l, false, new C4228l(c7711l, i3));
            default:
                return new C0878l(c7711l, 46);
        }
    }
}
