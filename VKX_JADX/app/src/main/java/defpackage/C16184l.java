package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٖؕۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16184l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C8706l f31678l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31679l;

    public /* synthetic */ C16184l(C8706l c8706l, int i) {
        this.f31679l = i;
        this.f31678l = c8706l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f31679l;
        C8706l c8706l = this.f31678l;
        switch (i) {
            case 0:
                AudioTrack audioTrack = (AudioTrack) obj;
                List listM4245throws = AbstractC16901l.m4245throws(c8706l.f17911l);
                AppActivity appActivity = (AppActivity) c8706l.isVip();
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(listM4245throws, 10));
                Iterator it = listM4245throws.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC16676l.billing((AudioTrack) it.next()));
                }
                AbstractC9092l.crashlytics(appActivity, new C14004l(arrayList), new C13305l(new C11392l(AbstractC16676l.billing(audioTrack)), 0L, listM4245throws, false, false, false, 122));
                break;
            case 1:
                VKResponseWithItems vKResponseWithItems = (VKResponseWithItems) obj;
                String str = vKResponseWithItems.purchase;
                c8706l.f17912l = str;
                c8706l.f23160l = !(str == null || str.length() == 0);
                LinkedHashMap linkedHashMap = c8706l.f17908l.admob;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                List list = vKResponseWithItems.crashlytics;
                if (list != null) {
                    int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(list, 10));
                    if (iFirebase < 16) {
                        iFirebase = 16;
                    }
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap(iFirebase);
                    for (Object obj2 : list) {
                        linkedHashMap3.put(String.valueOf(((VKProfile) obj2).yandex), obj2);
                    }
                    linkedHashMap2.putAll(linkedHashMap3);
                }
                List list2 = vKResponseWithItems.amazon;
                if (list2 != null) {
                    int iFirebase2 = AbstractC2200l.firebase(AbstractC14055l.billing(list2, 10));
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(iFirebase2 >= 16 ? iFirebase2 : 16);
                    for (Object obj3 : list2) {
                        linkedHashMap4.put(String.valueOf(-((VKProfile) obj3).yandex), obj3);
                    }
                    linkedHashMap2.putAll(linkedHashMap4);
                }
                linkedHashMap.putAll(linkedHashMap2);
                break;
            default:
                c8706l.f17906l = null;
                c8706l.f17913l = null;
                c8706l.mo782this();
                break;
        }
        return Unit.INSTANCE;
    }
}
