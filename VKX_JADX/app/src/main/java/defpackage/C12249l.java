package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lِۦٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12249l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ List f24305l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f24306l;

    public /* synthetic */ C12249l(C6069l c6069l, List list) {
        this.f24306l = 0;
        this.f24305l = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f24306l;
        List list = this.f24305l;
        switch (i) {
            case 0:
                List list2 = (List) obj;
                list2.add(new Catalog2Block.TextsBlock(28, "persist_disclaimer", null, null, null, Collections.singletonList("forDumb"), C0385l.yandex));
                VKXApplication.Companion companion = VKXApplication.f36628l;
                list2.add(new Catalog2Block.ActionsBlock(AbstractC16778l.tapsense(), new Catalog2Layout.HorizontalButtons(""), Collections.singletonList(new Catalog2Button(new Catalog2ButtonAction.SynthCustomAction(VKXApplication.Companion.loadAd(R.string.shuffle), null, R.drawable.ic_shuffle_outline_24, new C12249l(1, list)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131070)), null, null, 24));
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC16676l.mopub((AudioTrack) it.next()));
                }
                list2.add(new Catalog2Block.MusicAudiosBlock(28, "persist_trackContent", null, null, null, arrayList, C1188l.yandex));
                break;
            case 1:
                AbstractC9092l.loadAd((Context) obj, new C13099l(list), new C13305l(null, 0L, null, false, false, true, 95));
                break;
            default:
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((AbstractC0958l) it2.next()).loadAd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C12249l(int i, List list) {
        this.f24306l = i;
        this.f24305l = list;
    }
}
