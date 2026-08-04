package defpackage;

import androidx.recyclerview.widget.subs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkapi2.objects.message.ConversationElement;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lُۥُ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11473l extends AbstractC11519l {

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public final ArrayList f23059l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public final String f23060l;

    public C11473l() {
        VKXApplication.Companion companion = VKXApplication.f36628l;
        this.f23060l = VKXApplication.Companion.loadAd(R.string.messages_shared_media);
        this.f23059l = new ArrayList();
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: abstract */
    public final void mo1337abstract(int i) {
        final int i2 = 1;
        this.f23171l = true;
        C12772l c12772l = new C12772l(this.f23161l, i);
        final int i3 = 0;
        Function1 function1 = new Function1(this) { // from class: lؖۘؗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C11473l f8867l;

            {
                this.f8867l = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10 */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
            /* JADX WARN: Type inference failed for: r0v9 */
            /* JADX WARN: Type inference failed for: r4v3, types: [lّؔۜ] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = i3;
                C11473l c11473l = this.f8867l;
                switch (i4) {
                    case 0:
                        c11473l.mo2721import((Exception) ((Throwable) obj));
                        c11473l.f23171l = false;
                        break;
                    default:
                        VKResponseWithItems vKResponseWithItems = (VKResponseWithItems) obj;
                        ArrayList arrayList = c11473l.f23170l;
                        ArrayList arrayList2 = c11473l.f23059l;
                        Object obj2 = vKResponseWithItems.yandex;
                        Iterable iterable = (Iterable) obj2;
                        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(iterable, 10));
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((ConversationElement) it.next()).yandex);
                        }
                        arrayList.addAll(arrayList3);
                        List list = vKResponseWithItems.crashlytics;
                        ?? arrayList4 = C2580l.f5619l;
                        ?? r0 = list;
                        if (list == null) {
                            r0 = arrayList4;
                        }
                        arrayList2.addAll(r0);
                        List<VKProfile> list2 = vKResponseWithItems.amazon;
                        if (list2 != null) {
                            arrayList4 = new ArrayList(AbstractC14055l.billing(list2, 10));
                            for (VKProfile vKProfile : list2) {
                                vKProfile.yandex = -vKProfile.yandex;
                                arrayList4.add(vKProfile);
                            }
                        }
                        arrayList2.addAll(arrayList4);
                        c11473l.f23163l = true;
                        if (((List) obj2).size() < c11473l.f23161l) {
                            c11473l.f23160l = false;
                        }
                        c11473l.m3093instanceof();
                        c11473l.f23171l = false;
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        Function1 function2 = new Function1(this) { // from class: lؖۘؗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C11473l f8867l;

            {
                this.f8867l = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10 */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
            /* JADX WARN: Type inference failed for: r0v9 */
            /* JADX WARN: Type inference failed for: r4v3, types: [lّؔۜ] */
            /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection] */
            /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = i2;
                C11473l c11473l = this.f8867l;
                switch (i4) {
                    case 0:
                        c11473l.mo2721import((Exception) ((Throwable) obj));
                        c11473l.f23171l = false;
                        break;
                    default:
                        VKResponseWithItems vKResponseWithItems = (VKResponseWithItems) obj;
                        ArrayList arrayList = c11473l.f23170l;
                        ArrayList arrayList2 = c11473l.f23059l;
                        Object obj2 = vKResponseWithItems.yandex;
                        Iterable iterable = (Iterable) obj2;
                        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(iterable, 10));
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((ConversationElement) it.next()).yandex);
                        }
                        arrayList.addAll(arrayList3);
                        List list = vKResponseWithItems.crashlytics;
                        ?? arrayList4 = C2580l.f5619l;
                        ?? r0 = list;
                        if (list == null) {
                            r0 = arrayList4;
                        }
                        arrayList2.addAll(r0);
                        List<VKProfile> list2 = vKResponseWithItems.amazon;
                        if (list2 != null) {
                            arrayList4 = new ArrayList(AbstractC14055l.billing(list2, 10));
                            for (VKProfile vKProfile : list2) {
                                vKProfile.yandex = -vKProfile.yandex;
                                arrayList4.add(vKProfile);
                            }
                        }
                        arrayList2.addAll(arrayList4);
                        c11473l.f23163l = true;
                        if (((List) obj2).size() < c11473l.f23161l) {
                            c11473l.f23160l = false;
                        }
                        c11473l.m3093instanceof();
                        c11473l.f23171l = false;
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        C1412l c1412l = new C1412l(10, c12772l);
        C0786l c0786l = new C0786l(i3, function2);
        VKXApplication vKXApplication = VKXApplication.f36631l;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC10999l.mopub(vKXApplication, null, 0, new C0469l(c0786l, c12772l, function1, c1412l, (InterfaceC14029l) null), 3);
    }

    @Override // defpackage.AbstractC2484l
    /* JADX INFO: renamed from: continue */
    public final String mo648continue() {
        return this.f23060l;
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: new */
    public final subs mo1270new() {
        return new C18022l(this);
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: super */
    public final void mo1271super() {
    }
}
