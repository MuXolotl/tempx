package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.subs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedItem;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* JADX INFO: renamed from: lؔ۟ٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2935l extends AbstractC3372l {

    /* JADX INFO: renamed from: lؚؑۥ, reason: contains not printable characters */
    public final C9554l f6391l = new C9554l(new Catalog2Response(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823));

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public final long f6392l;

    public C2935l(long j) {
        this.f6392l = j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.AbstractC3372l
    /* JADX INFO: renamed from: break */
    public final Object mo850break(int i, InterfaceC14029l interfaceC14029l) {
        C0406l c0406l;
        if (interfaceC14029l instanceof C0406l) {
            c0406l = (C0406l) interfaceC14029l;
            int i2 = c0406l.f1523l;
            if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0406l.f1523l = i2 - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0406l = new C0406l(this, (AbstractC0283l) interfaceC14029l);
            }
        } else {
            c0406l = new C0406l(this, (AbstractC0283l) interfaceC14029l);
        }
        Object objSubs = c0406l.f1522l;
        int i3 = c0406l.f1523l;
        int i4 = this.f23161l;
        if (i3 == 0) {
            AbstractC2829l.crashlytics(objSubs);
            C7093l c7093l = new C7093l(i4, this.f6392l, i);
            c0406l.f1523l = 1;
            objSubs = c7093l.subs(c0406l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objSubs == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i3 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objSubs);
        }
        VKResponseWithItems vKResponseWithItems = (VKResponseWithItems) objSubs;
        if (((List) vKResponseWithItems.yandex).size() <= i4) {
            this.f23160l = false;
        }
        LinkedHashMap linkedHashMap = this.f6391l.admob;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List list = vKResponseWithItems.crashlytics;
        if (list != null) {
            int iFirebase = AbstractC2200l.firebase(AbstractC14055l.billing(list, 10));
            if (iFirebase < 16) {
                iFirebase = 16;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(iFirebase);
            for (Object obj : list) {
                linkedHashMap3.put(String.valueOf(((VKProfile) obj).yandex), obj);
            }
            linkedHashMap2.putAll(linkedHashMap3);
        }
        List list2 = vKResponseWithItems.amazon;
        if (list2 != null) {
            int iFirebase2 = AbstractC2200l.firebase(AbstractC14055l.billing(list2, 10));
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(iFirebase2 >= 16 ? iFirebase2 : 16);
            for (Object obj2 : list2) {
                linkedHashMap4.put(String.valueOf(-((VKProfile) obj2).yandex), obj2);
            }
            linkedHashMap2.putAll(linkedHashMap4);
        }
        linkedHashMap.putAll(linkedHashMap2);
        List<NewsfeedItem> list3 = (List) vKResponseWithItems.yandex;
        ArrayList arrayList = new ArrayList();
        C8103l c8103l = new C8103l(5, arrayList);
        for (NewsfeedItem newsfeedItem : list3) {
            List list4 = newsfeedItem.remoteconfig;
            if (list4 != null) {
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    c8103l.invoke(it.next());
                }
            }
            c8103l.invoke(newsfeedItem);
        }
        return arrayList;
    }

    @Override // defpackage.AbstractC11519l, defpackage.AbstractC2484l
    /* JADX INFO: renamed from: case */
    public final AbstractC14412l mo647case() {
        return new C7511l();
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: new, reason: not valid java name */
    public final subs mo1270new() {
        return new C17022l(3, false, this.f6391l);
    }

    @Override // defpackage.AbstractC11519l
    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final void mo1271super() {
        this.f6391l.loadAd();
    }

    @Override // defpackage.AbstractC3372l
    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final Object mo1272transient(List list, InterfaceC14029l interfaceC14029l) {
        subs subsVar = this.f23165l;
        if (subsVar == null) {
            subsVar = null;
        }
        ((C17022l) subsVar).appmetrica(list);
        return Unit.INSTANCE;
    }
}
