package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٗٓٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17117l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f33289l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f33290l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f33291l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ String f33292l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public /* synthetic */ Object f33293l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17117l(ArrayList arrayList, int i, String str, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f33289l = arrayList;
        this.f33290l = i;
        this.f33292l = str;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        Object c14247l;
        int i = this.f33291l;
        InterfaceC14029l interfaceC14029l = null;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            int i2 = this.f33290l;
            ArrayList arrayList = this.f33289l;
            String str = (String) AbstractC16901l.m4220for(i2, arrayList);
            String str2 = this.f33292l;
            boolean z = str2.equals("episode") || str2.equals("episode_list") || AbstractC12024l.appmetrica((CharSequence) arrayList.get(0), "_Episode", false);
            VKXApplication.Companion companion = VKXApplication.f36628l;
            if (!VKXApplication.Companion.crashlytics()) {
                c14247l = new C14247l(arrayList);
            } else if (z) {
                List listM3338public = AbstractC12024l.m3338public((CharSequence) AbstractC12024l.m3338public((CharSequence) arrayList.get(0), new String[]{"_Episode"}, 6).get(0), new String[]{"_"}, 6);
                c14247l = new C7839l(Long.parseLong((String) listM3338public.get(0)), Integer.parseInt((String) listM3338public.get(1)), "");
            } else {
                c14247l = new C14004l(arrayList);
            }
            C13305l c13305l = new C13305l(str != null ? new C11392l(str) : C4618l.yandex, 0L, null, false, false, false, 118);
            this.f33293l = null;
            this.f33291l = 1;
            Object objFirebase = AbstractC10999l.firebase(AbstractC11463l.yandex, new C12393l(c13305l, c14247l, interfaceC14029l, 2), this);
            Object obj2 = EnumC9342l.f19165l;
            if (objFirebase != obj2) {
                objFirebase = Unit.INSTANCE;
            }
            if (objFirebase == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C17117l c17117l = new C17117l(this.f33289l, this.f33290l, this.f33292l, interfaceC14029l);
        c17117l.f33293l = obj;
        return c17117l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C17117l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
