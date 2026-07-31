package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: lٍٍؘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C9435l implements InterfaceC16975l, InterfaceC11724l, InterfaceC3266l, InterfaceC0407l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f19295l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ long f19296l;

    public /* synthetic */ C9435l(long j, C4330l c4330l) {
        this.f19296l = j;
        this.f19295l = c4330l;
    }

    @Override // defpackage.InterfaceC3266l
    public Object admob(C3726l c3726l, C6499l c6499l, int i) {
        return c3726l.appmetrica(c6499l, AbstractC1186l.isVip((C2427l) this.f19295l), 0, this.f19296l);
    }

    @Override // defpackage.InterfaceC0407l
    public Object apply(Object obj) {
        C4330l c4330l = (C4330l) this.f19295l;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f19296l));
        String str = c4330l.yandex;
        EnumC14251l enumC14251l = c4330l.crashlytics;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC8542l.yandex(enumC14251l))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(AbstractC8542l.yandex(enumC14251l)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // defpackage.InterfaceC11724l
    public void billing(InterfaceC4725l interfaceC4725l, int i) {
        C13208l c13208l = (C13208l) this.f19295l;
        interfaceC4725l.mo437l(c13208l.crashlytics, i, this.f19296l);
    }

    @Override // defpackage.InterfaceC16975l
    public void invoke(Object obj) {
        ((InterfaceC5252l) obj).firebase((C5597l) this.f19295l, this.f19296l);
    }

    public /* synthetic */ C9435l(long j, Object obj) {
        this.f19295l = obj;
        this.f19296l = j;
    }
}
